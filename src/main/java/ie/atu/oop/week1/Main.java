package ie.atu.oop.week1;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        try {
            Book myBook = new Book("Coding Java","Rustem", 443);
            System.out.println("Creating new book");
        } catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}