namespace SoftUniBlogCSharp.Controllers
{
    using System.Linq;
    using Microsoft.AspNetCore.Authorization;
    using Microsoft.AspNetCore.Mvc;
    using Microsoft.EntityFrameworkCore;
    using SoftUniBlogCSharp.Data;
    using SoftUniBlogCSharp.Models;

    public class ArticlesController : Controller
    {
        private readonly ApplicationDbContext database;

        public ArticlesController(ApplicationDbContext context)
        {
            database = context;
        }

        // GET: Articles
        public ActionResult Index()
        {
            return RedirectToAction("List", "Articles");
        }

        public ActionResult List()
        {
            var articles = database.Articles
                .Include(a => a.Author)
                .ToList();

            return View(articles);
        }

        // GET: Articles/Details/5
        public ActionResult Details(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var article = database.Articles
                .Include(a => a.Author)
                .First(m => m.Id == id);

            if (article == null)
            {
                return NotFound();
            }

            return View(article);
        }

        // GET: Articles/Create
        [Authorize]
        public ActionResult Create()
        {
            return View();
        }

        // POST: Articles/Create        
        [HttpPost]
        [Authorize]
        public ActionResult Create(Article article)
        {
            if (ModelState.IsValid)
            {
                var authorId = database.Users
                    .Where(u => u.UserName == this.User.Identity.Name)
                    .First()
                    .Id;

                article.AuthorId = authorId;

                database.Articles.Add(article);
                database.SaveChanges();

                return RedirectToAction("Index");
            }

            return View(article);
        }

        // GET: Articles/Edit/5
        [Authorize]
        public ActionResult Edit(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var article = database.Articles
               .Include(a => a.Author)
               .First(m => m.Id == id);

            if (!IsAuthorized(article))
            {
                return Forbid();
            }

            if (article == null)
            {
                return NotFound();
            }

            var model = new ArticleViewModel();
            model.Id = article.Id;
            model.Title = article.Title;
            model.Content = article.Content;

            return View(model);
        }

        // POST: Articles/Edit/5       
        [HttpPost]
        [Authorize]
        public ActionResult Edit(int id, ArticleViewModel model)
        {
            if (ModelState.IsValid)
            {
                var article = database.Articles
                    .Where(a => a.Id == model.Id)
                    .Include(a => a.Author)
                    .FirstOrDefault();

                if (!IsAuthorized(article))
                {
                    return Forbid();
                }

                article.Title = model.Title;
                article.Content = model.Content;

                database.Update(article);
                database.SaveChanges();

                return RedirectToAction("Index");
            }

            return View(model);
        }

        // GET: Articles/Delete/5
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return NotFound();
            }

            var article = database.Articles
                .Include(a => a.Author)
                .First(m => m.Id == id);

            if (!IsAuthorized(article))
            {
                return Forbid();
            }

            if (article == null)
            {
                return NotFound();
            }

            return View(article);
        }

        // POST: Articles/Delete/5
        [HttpPost, ActionName("Delete")]
        [Authorize]
        public ActionResult DeleteConfirmed(int id)
        {
            var article = database.Articles
                .Include(a => a.Author)
                .First(m => m.Id == id);

            if (!IsAuthorized(article))
            {
                return Forbid();
            }

            if (article == null)
            {
                return NotFound();
            }

            database.Articles.Remove(article);
            database.SaveChanges();

            return RedirectToAction("Index");
        }

        private bool ArticleExists(int id)
        {
            return database.Articles.Any(e => e.Id == id);
        }

        private bool IsAuthorized(Article article)
        {
            bool isAuthor = article.IsAuthor(this.User.Identity.Name);
            bool isAdmin = User.IsInRole("Admin");

            return isAdmin || isAuthor;
        }
    }
}
