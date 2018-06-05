using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MessageBoardApp.Models
{
    public class Reply
    {
        [Key]
        public int Id { get; set; }
        public int MessageId { get; set; }
        public string ReplyFrom { get; set; }
        [Required]
        public string ReplyMessage { get; set; }
        public DateTime ReplyDateTime { get; set; }
    }
}
