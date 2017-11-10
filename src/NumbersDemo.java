public class NumbersDemo
{
    public static void main(String args[])
    {
        int numOne=3, numTwo=7;

        displayTwiceTheNumber(numOne);
        displayNumberPlusFive(numOne);
        displayNumberSquared(numOne);

        displayTwiceTheNumber(numTwo);
        displayNumberPlusFive(numTwo);
        displayNumberSquared(numTwo);
    }

    private static void displayTwiceTheNumber(int num)
    {
        System.out.println("Twice\t" + num + " = " + num * 2);
    }

    private static void displayNumberPlusFive(int num)
    {
        System.out.println("\t" + num + " + 5 = " + num + 5);
    }

    private static void displayNumberSquared(int num)
    {
        System.out.println(num + " Squared = " + num * num);
    }
}