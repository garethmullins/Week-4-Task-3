public class Percentages
{
    public static void main(String args[])
    {
        double varOne=2.0,varTwo=5.0;

        computePercent(varOne,varTwo);
        computePercent(varTwo,varOne);
    }

    private static void computePercent(double varOne, double varTwo)
    {
        double percentage = varOne/varTwo*100;
        System.out.println(varOne + " is " + percentage + " percent of " + varTwo);
    }
}