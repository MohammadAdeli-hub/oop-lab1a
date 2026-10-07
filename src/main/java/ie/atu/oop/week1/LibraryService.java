package ie.atu.oop.week1;

public class LibraryService
{
    private static final int MAX_LOAN_DAYS =14;
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
}
