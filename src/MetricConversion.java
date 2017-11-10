import java.util.Scanner;
public class MetricConversion
{
    public static void main(String args[])
    {
        float metricVar;

        Scanner input = new Scanner(System.in);
        System.out.print("Metric value that's to be converted ");
        metricVar = input.nextFloat();

        centimetersToInches(metricVar);
        litersToGallons(metricVar);
    }

    private static void centimetersToInches(float centimeters)
    {
        final float centirmeterPerInch = 2.54f;
        float inches;

        inches = centimeters / centirmeterPerInch;

        System.out.println(centimeters + " centimeters equals " + inches + " inches.");
    }

    private static void litersToGallons(float liters)
    {
        final float literPerGallon = 3.7854f;
        float gallons;

        gallons = liters / literPerGallon;

        System.out.println(liters + " liters equals " + gallons + " gallons.");
    }
}