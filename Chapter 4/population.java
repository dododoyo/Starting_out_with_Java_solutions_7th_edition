import java.util.Scanner;
public class population 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the starting number of organisms: ");
        double starting = keyboard.nextDouble();
        while (starting < 2)
        {
            System.out.println("Invalid input.");
            System.out.print("Please enter the starting number of organisms again: ");
            starting = keyboard.nextInt();
        }
        System.out.print("Please enter the average increase rate per day in percentage:");
        double rate = keyboard.nextDouble();
        while (rate <0)
        {
            System.out.println("Invalid input.");
            System.out.print("Please enter the average increase rate per day in percentage again:");
            rate = keyboard.nextDouble();
        }
        rate = rate/100;
        System.out.print("Please enter the number of days the sample will be left to multiply: ");
        double days = keyboard.nextDouble();
        while (days < 1)
        {
            System.out.println("Invalid input.");
            System.out.print("Please enter the number of days the sample will be left to multiply again: ");
            days = keyboard.nextDouble();
        }
        System.out.print("Day after\t Number of organisms");
        System.out.println("\n-------------------------------------");
        for (int day = 1 ;day <= days;day++)
        {
            starting = starting*(1+rate);
            System.out.println(day + "   \t\t   " + starting);
        }
    }    
}
