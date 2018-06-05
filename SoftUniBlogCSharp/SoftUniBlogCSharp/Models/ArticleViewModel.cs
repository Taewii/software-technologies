namespace SoftUniBlogCSharp.Models
{
    using System.ComponentModel.DataAnnotations;

    public class ArticleViewModel
    {
        public int Id { get; set; }

        [Required]
        [StringLength(50)]
        public string Title { get; set; }

        public string Content { get; set; }

        public string AuthorId { get; set; }
    }  
}
