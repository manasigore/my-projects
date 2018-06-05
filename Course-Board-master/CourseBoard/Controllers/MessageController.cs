using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using SendGrid.SmtpApi;
using SendGrid;
using System.Net;
using System.Net.Mail;
using MessageBoardApp.Models;
using MessageBoardApp.ViewModels;


namespace MessageBoardApp.Controllers
{
    public class MessageController : ApplicationBaseController
    {
        private ApplicationDbContext dbContext = new ApplicationDbContext();
        [HttpPost]
        [Authorize]
        public ActionResult PostMessage(MessageReplyViewModel vm)
        {
            var username = User.Identity.Name;
            string fullName = "";
            int msgid = 0;
            if (!string.IsNullOrEmpty(username))
            {
                var user = dbContext.Users.SingleOrDefault(u => u.UserName == username);
                fullName = string.Concat(new string[] { user.FirstName, " ", user.LastName });
            }
            Message messagetoPost = new Message();
            if (vm.Message.Subject != string.Empty && vm.Message.MessageToPost != string.Empty)
            {
                messagetoPost.DatePosted = DateTime.Now;
                messagetoPost.Subject = vm.Message.Subject;
                messagetoPost.MessageToPost = vm.Message.MessageToPost;
                messagetoPost.From = fullName;

                dbContext.Messages.Add(messagetoPost);
                dbContext.SaveChanges();
                msgid = messagetoPost.Id;
            }

            return RedirectToAction("Index", "Home", new { Id = msgid });
        }

        public ActionResult Create()
        {
            MessageReplyViewModel vm = new MessageReplyViewModel();

            return View(vm);
        }

        [HttpPost]
        [Authorize]
        public ActionResult ReplyMessage(MessageReplyViewModel vm, int messageId)
        {
            var username = User.Identity.Name;
            string fullName = "";
            if (!string.IsNullOrEmpty(username))
            {
                var user = dbContext.Users.SingleOrDefault(u => u.UserName == username);
                fullName = string.Concat(new string[] { user.FirstName, " ", user.LastName });
            }
            if (vm.Reply.ReplyMessage != null)
            {
                Reply _reply = new Reply();
                _reply.ReplyDateTime = DateTime.Now;
                _reply.MessageId = messageId;
                _reply.ReplyFrom = fullName;
                _reply.ReplyMessage = vm.Reply.ReplyMessage;
                dbContext.Replies.Add(_reply);
                dbContext.SaveChanges();
            }
            //reply to the message owner          - using email template

            var messageOwner = dbContext.Messages.Where(x => x.Id == messageId).Select(s => s.From).FirstOrDefault();
            var users = from user in dbContext.Users
                        orderby user.FirstName
                        select new
                        {
                            FullName = user.FirstName + " " + user.LastName,
                            UserEmail = user.Email
                        };

            var uemail = users.Where(x => x.FullName == messageOwner).Select(s => s.UserEmail).FirstOrDefault();
            SendGridMessage replyMessage = new SendGridMessage();
            replyMessage.From = new MailAddress(username);
            replyMessage.Subject = "Reply for your message :" + dbContext.Messages.Where(i=>i.Id==messageId).Select(s=>s.Subject).FirstOrDefault();
            replyMessage.Text = vm.Reply.ReplyMessage;

           
            replyMessage.AddTo(uemail);

            
            var credentials = new NetworkCredential("YOUR SENDGRID USERNAME", "PASSWORD");
            var transportweb = new Web(credentials);
            transportweb.DeliverAsync(replyMessage);
            return RedirectToAction("Index", "Home", new { Id = messageId });

        }

        [HttpPost]
        [Authorize]
        public ActionResult DeleteMessage(int messageId)
        {
            Message _messageToDelete = dbContext.Messages.Find(messageId);
            dbContext.Messages.Remove(_messageToDelete);
            dbContext.SaveChanges();

            // also delete the replies related to the message
            var _repliesToDelete = dbContext.Replies.Where(i => i.MessageId == messageId).ToList();
            if (_repliesToDelete != null)
            {
                foreach (var rep in _repliesToDelete)
                {
                    dbContext.Replies.Remove(rep);
                    dbContext.SaveChanges();
                    }
            }


            return RedirectToAction("Index", "Home");
        }
    }
}
