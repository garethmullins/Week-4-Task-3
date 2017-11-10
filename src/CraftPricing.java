import java.util.Scanner;
public class CraftPricing
{
    public static void main(String args[])
    {
        float materialCost, hours, price;
        String product;

        Scanner input = new Scanner(System.in);
        System.out.print("Name ");
        product = input.nextLine();
        System.out.print("Material Cost ");
        materialCost = input.nextFloat();
        System.out.print("Hours ");
        hours = input.nextFloat();

        price = calcRetail(materialCost, hours);

        System.out.printf(product + " has a retail price of $%.2f", price);
    }

    private static float calcRetail(float materialCost, float hours)
    {
        final float baseCost = 12, shippingAndHandaling = 7;

        return (materialCost + baseCost) * hours + shippingAndHandaling;
    }
}