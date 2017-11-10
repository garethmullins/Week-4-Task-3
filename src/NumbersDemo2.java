import java.util.Scanner;
public class NumbersDemo2
{
    public static void main(String args[])
    {
        int numOne, numTwo;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number ");
        numOne = input.nextInt();
        System.out.print("Enter the Second Number ");
        numTwo = input.nextInt();

        displayTwiceTheNumber(numOne);
        displayNumberPlusFive(numOne);
        displayNumberSquared(numOne);

        displayTwiceTheNumber(numTwo);
        displayNumberPlusFive(numTwo);
        displayNumberSquared(numTwo);
    }

    private static void displayTwiceTheNumber(int num)
    {
        int twiceNum = num * 2;
        System.out.println("Twice\t" + num + " = " + twiceNum);
    }

    private static void displayNumberPlusFive(int num)
    {
        int numPlusFive = num + 5;
        System.out.println("\t" + num + " + 5 = " + numPlusFive);
    }

    private static void displayNumberSquared(int num)
    {
        int numSquared = num * num;
        System.out.println(num + " Squared = " + numSquared);
    }
}