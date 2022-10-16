import java.util.Scanner;
public class MilesPerGallon 
{
    public static void main(String[] args)
    {
        double miles;
        double gallon;
        double milesPerGallon;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of miles driven: ");
        miles = keyboard.nextDouble();
        System.out.print("Please enter the gallons of gas used: ");
        gallon = keyboard.nextDouble();
        milesPerGallon = miles/gallon;
        System.out.println("\nThe value of miles per gallon will be: "+ milesPerGallon);
    }
    
}
