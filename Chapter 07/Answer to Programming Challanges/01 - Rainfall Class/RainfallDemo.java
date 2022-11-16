import java.util.Scanner;
public class RainfallDemo 
{
    public static void main(String[] args)
    {
        double[] rainfalls = new double[12];
        Scanner keyboard  = new Scanner(System.in);
        Rainfall calculator = new Rainfall();
        System.out.println("Please enter the data for each month.\n\n");
        for (int i = 0; i < 12 ; i++)
        {
            System.out.print("Please enter rainfall amount for month "+ (i+1)+" : ");
            double monthly = keyboard.nextInt();
            while ( monthly < 0)
            {
                System.out.println("Invalid Entry. ");
                System.out.print("Please enter rainfall amount for month "+ (i+1)+" : ");
                monthly = keyboard.nextInt();
                
            }
            rainfalls[i] = monthly;

        }
        System.out.print("\nThe total amount of rainfall in this year is: ");
        System.out.println(calculator.totalRainfall(rainfalls));
        System.out.print("The average of rainfall in this year is: ");
        System.out.println(calculator.averageRainfall(rainfalls));
        System.out.print("The maximum amount  of rainfall in a month in this year is: ");
        System.out.println(calculator.maxRainfall(rainfalls));
        System.out.print("The minimum amount  of rainfall in a month in this year is: ");
        System.out.println(calculator.minRainfall(rainfalls));

    }
    
}
