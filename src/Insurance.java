import java.util.Scanner;
public class Insurance
{
    public static void main(String args[])
    {
        int birthYear, currentYear, premium;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your year of birth ");
        birthYear = input.nextInt();
        System.out.print("Enter the current year ");
        currentYear = input.nextInt();

        premium = premiumCalculation(birthYear, currentYear);

        System.out.println("The premium amount is $" + premium);
    }

    private static int premiumCalculation(int birthYear, int currentYear)
    {
        final int addedYears = 15, multiplier = 20;
        int years, decades;

        years = currentYear - birthYear;
        decades = years / 10;
        return (decades + addedYears) * multiplier;
    }
}