using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MessageBoardApp.Models
{
    public class Message
    {
        [Key]
        public int Id { get; set; }
        [Required]
        public string Subject { get; set; }
         [Required]
        public string MessageToPost { get; set; }
        public string From { get; set; }
        public DateTime DatePosted { get; set; }

    }
}
