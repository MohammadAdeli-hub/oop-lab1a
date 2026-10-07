package ie.atu.oop.week1;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Book dune = new Book("Dune", "Frank Hebert",223);
        Book JavaCode =new Book("Java Code", "David Harrison",234);
        Book Soccer= new Book("Soccer", "Cristiano Ronaldo",434);
        LibraryService service = new LibraryService();
        service.addBook(dune);
        service.addBook(JavaCode);
        service.addBook(Soccer);
        System.out.println("Books:"+ service.getBookCount());
        for (Book book : service.getAllBooks())
        {
            System.out.println(book.getTitle());
        }
    }
}