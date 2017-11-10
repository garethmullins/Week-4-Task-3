import java.util.Scanner;
public class Percentages2
{
    public static void main(String args[])
    {
        double varOne,varTwo;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First Number ");
        varOne = input.nextDouble();
        System.out.print("Enter the Second Number ");
        varTwo = input.nextDouble();

        computePercent(varOne,varTwo);
        computePercent(varTwo,varOne);
    }

    private static void computePercent(double varOne, double varTwo)
    {
        double percentage = varOne/varTwo*100;
        System.out.println(varOne + " is " + percentage + " percent of " + varTwo);
    }
}