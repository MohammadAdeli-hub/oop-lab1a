package ie.atu.oop.week1;
import java.util.ArrayList;
import java.util.List;

public class LibraryService
{
    private static final int MAX_LOAN_DAYS =14;
    private final List<Book> books = new ArrayList<>();
    public void LoanBook(Book book,int loanday)
    {
        if (book == null)
        {
            throw new IllegalArgumentException("Book can not be Empty");
        }
        if (loanday<1||loanday>MAX_LOAN_DAYS)
        {
            throw new IllegalArgumentException("The loanday must be between 1 and 14 days");
        }
         Book.BorrowBook();
    }
    public void addBook(Book book)
    {
        if(book == null)
        {
            throw new IllegalArgumentException("Book must not be Empty");
        }
        books.add(book);
    }
    public int getBookCount()
    {
        return books.size();
    }

    public List<Book> getAllBooks()
    {
        return  new ArrayList<>(books);
    }
    public Book findBookByTitle(String title)
    {
        for (Book book : books)
        {
            if (book.getTitle().equalsIgnoreCase(title))
            {
                return book;

            }

        }
        return null;
    }
}
