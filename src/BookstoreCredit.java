import java.util.Scanner;
public class BookstoreCredit
{
    public static void main(String args[])
    {
        double credit, GPA;
        String Name;

        Scanner input = new Scanner(System.in);
        System.out.print("Name ");
        Name = input.nextLine();
        System.out.print("Grade Point Average ");
        GPA = input.nextDouble();

        credit = GPA * 10;

        System.out.printf(Name + " has a GPA of " + GPA + " and a book store credit of $%.2f", credit);
    }
}