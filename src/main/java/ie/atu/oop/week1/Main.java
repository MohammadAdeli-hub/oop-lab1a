package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("hellow oop");
        Book myBook1 = new Book();
        myBook1.title = "OOP";
        myBook1.author = "Franklin O Connor";
        myBook1.pageCount= 412;
        myBook1.available = false;


        Book myBook2 = createBook("little programmer","Jake Hooper",221);
        Book myBook3 = createBook("Java ","Jamal Singh",211);
        Book myBook4 = createBook("programmers life ","Fion Joyce",222);
        myBook1.displayDetails();
        myBook2.displayDetails();
        myBook3.displayDetails();
        myBook4.displayDetails();
        myBook1.borrowBook();
        myBook2.borrowBook();
        myBook1.displayDetails();




    }
    private static Book createBook(String title, String author, int pageCount)
    {
        Book myBook = new Book();
        myBook.title = title;
        myBook.author = author;
        myBook.pageCount = pageCount;
        return myBook;

    }
}