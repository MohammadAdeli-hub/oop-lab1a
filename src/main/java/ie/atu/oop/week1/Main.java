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
        myBook.available = true;
        myBook.displayDetails();


        Book myBook2 = new Book();
        myBook2.title = "the little programmer";
        myBook2.author = "Jake Hooper";
        myBook2.pageCount = 221;
        myBook2.available = true;
        myBook2.displayDetails();



    }
}