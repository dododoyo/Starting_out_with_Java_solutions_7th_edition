import java.util.Scanner;
public class FreezingAndBoilingDemo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the Temprature in Fahrenheit: ");
        double fahtemp = keyboard.nextDouble();
        FreezingAndBoiling newtemp = new FreezingAndBoiling(fahtemp);
        if (newtemp.ISETHYLBOILING())
        System.out.println("Ethyl is boiling in this temprature.");
        if (newtemp.ISWATERBOILING())
        System.out.println("Water is boiling in this temprature.");
        if (newtemp.ISOXYGENBOILING())
        System.out.println("Oxygen is boiling in this temprature.");
        if (newtemp.ISETHYLFREEZING())
        System.out.println("Ethyl is freezing at this temprature.");
        if (newtemp.ISOXYGENFREEZING())
        System.out.println("Oxygen is freezing at this temprature.");
        if (newtemp.ISWATERFREEZING())
        System.out.println("Water is freezing at this temprature.");
    }
    
}
