import java.util.Scanner;
public class PaintCalculator
{
    public static void main(String args[])
    {
        final float squareFeetPerGallon = 350f, price = 32f;
        float length, width, height, area, gallons, cost;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length in Feet ");
        length = input.nextFloat();
        System.out.print("Enter the Width in Feet ");
        width = input.nextFloat();
        System.out.print("Enter the Height in Feet ");
        height = input.nextFloat();

        area = 2 * (length * height + width * height);

        gallons = gallonsNeeded(area, squareFeetPerGallon);

        System.out.println(gallons + " Gallons are needed to paint the wall.");

        cost = pricing(gallons, price);

        System.out.println("The paint required to paint a wall with the dimensions " + length + " by " + width + " by " + height + " feet is evaluated as $" + cost);
    }

    private static float gallonsNeeded(float area, float squareFeetPerGallon)
    {
        return (area / squareFeetPerGallon);
    }

    private static float pricing(float gallons, float price)
    {
        return (gallons * price);
    }
}