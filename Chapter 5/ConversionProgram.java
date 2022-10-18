import java.util.Scanner;
public class ConversionProgram 
{
    public static void main(String[] args)
    {
        int choice = 4;
        Scanner keyboard = new Scanner(System.in);
        do
        {
            System.out.print("Please enter the distance to be converted in meters: ");
            double meters = keyboard.nextDouble();
            System.out.println("\nYou have the following choices:\n");
            System.out.println("1. Convert to kilometers");
            System.out.println("2. Convert to Inches");
            System.out.println("3. Convert to Feet");
            System.out.println("4. Quit the program");
            System.out.print("\nPlease enter your choice here: ");
            choice = keyboard.nextInt();
            if (choice == 1)
            {
                double kilos = toKiloMeters(meters);
                showKiometers(kilos);
            }
            else if (choice == 2)
            {
                double inches = toInches(meters);
                showInches(inches);
            }
            else if (choice == 3)
            {
                double feet = toFeet(meters);
                showFeet(feet);
            }
            
        }while (choice != 4);
    }
    

    public static double toKiloMeters(double theMeters)
    {
        return theMeters/1000;
    }


    public static double toInches(double theMeters)
    {
        return theMeters*39.37;
    }


    public static double toFeet(double theMeters)
    {
        return theMeters*3.281;
    }


    public static void showFeet(double theFeet)
    {
        System.out.printf("The entered amount of meters in feet is: %,.2f\n\n",theFeet);
    }


    public static void showInches(double theInches)
    {
        System.out.printf("The entered amount of meters in Inches is: %,.2f\n\n",theInches);
    }


    public static void showKiometers(double theKilometers)
    {
        System.out.printf("The entered amount of meters in KiloMeters is: %,.2f\n\n",theKilometers);
    }  
}
