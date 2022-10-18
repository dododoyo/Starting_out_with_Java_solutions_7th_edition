import java.util.Scanner;
public class averageRainfall 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of years that will be calculated: ");
        int years = keyboard.nextInt();
        while(years<1)
        {
            System.out.println("Invalid amount of years entered,amount of years must be greater than 1");
            System.out.print("Please enter the number of years that will be calculated again: ");
            years = keyboard.nextInt();
        }
        double totalRainfall=0;
        for (int year = 1 ;years>=year;year++)
        {
            for (int month = 1;month <=12;month++)
            {
                System.out.println("Please enter rainfall amount for month "+month);
                totalRainfall += keyboard.nextDouble();

            }

        }
        int totalMonth = 12*years;
        double averageRainfall = totalRainfall/totalMonth;
        System.out.println("The total number of months recorded is: "+totalMonth);
        System.out.println("The total amount of rainfall recorded is: "+totalRainfall);
        System.out.printf("The average value of rainfall in the months recorded is: %,.2f", averageRainfall);
    }   
}
