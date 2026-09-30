package ie.atu.oop.week1;

public class Book
{
        private String title;
        private String author;
        private int pages;

        public Book(String title, String author, int pages)
        {
            if(title==null||title.isEmpty())
            {
                throw new IllegalArgumentException("Title cannot be null or empty");
            }
            if(author==null||author.isEmpty())
            {
                throw new IllegalArgumentException("Author cannot be null or empty");
            }
            if (pages<1)
            {
                throw new IllegalArgumentException("Pages cannot be less than 1");
            }


            this.title = title;
            this.author = author;
            this.pages = pages;

        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getPages() {
            return pages;
        }

}
