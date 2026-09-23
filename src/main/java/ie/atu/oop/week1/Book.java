package ie.atu.oop.week1;

public class Book
{
    public String title;
    public String author;
    public int pageCount;
    public boolean available;
    public Book()
    {

    }
    public void displayDetails()
    {
        System.out.printf("the book is \n"+title);
        System.out.println("the author is\n "+author   );
        System.out.println("the page count is \n"+pageCount);
        System.out.println("the available is \n"+available);

    }
    public void borrowBook()
    {
        if (available)
        {
            available = false;
            System.out.printf("the book has been borrowed\n");

        }
        else
        {
            System.out.println("is already borrowed");
        }
    }



}
