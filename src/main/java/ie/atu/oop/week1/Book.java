package ie.atu.oop.week1;

public class Book
{
        private final String title;
        private final String author;
        private final int pages;
        private static BookStatus status;

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
            this.status =BookStatus.AVAILABLE;
        }
        public String getTitle()
        {
            return title;
        }

        public String getAuthor()
        {
            return author;
        }

        public int getPages()
        {
            return pages;
        }

    public BookStatus getStatus() {
        return status;
    }
    public static void BorrowBook()
    {
        if (status == BookStatus.ON_LOAN)
        {
            throw new IllegalStateException("The selected Book is on Loan");
        }
        status = BookStatus.ON_LOAN;
    }
    public static void ReturnBook()
    {
        if (status==BookStatus.AVAILABLE)
        {
            throw new IllegalStateException("The Book is returned");
        }
        status =BookStatus.AVAILABLE;
    }
}

