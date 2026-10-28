package ie.atu.oop.week1;
import java.util.Scanner;

public class EceptionWarmUp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner scanner= new Scanner(System.in);
        boolean valid =false;
        while (!valid)
        {
            System.out.println("Enter a page count: ");
            String text = scanner.nextLine();
            try {
                int pagecount = Integer.parseInt(text);
                System.out.println("You Entered "+ pagecount);
            }
            catch (NumberFormatException ex)
            {
                System.out.println("Please Enter A Whole number");
            }
        }
        System.out.println("Program contnues");
    }

}
