package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        System.out.println("hellow oop");
        Book myBook = new Book();
        myBook.title = "OOP";
        myBook.author = "Fraklin O Connor";
        myBook.pageCount= 412;
        System.out.printf("the book is \n"+myBook.title);
        System.out.println("the author is\n "+myBook.author   );
        System.out.println("the page count is \n"+myBook.pageCount);
        System.out.println("the available is \n"+myBook.available);

    }
}