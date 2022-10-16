import java.util.Scanner;
public class MassToWeight
{
    public static void main(String[] args)
    {
        double mass,weight;
        final double gravity = 9.8;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the mass of the object in Kg: ");
        mass = keyboard.nextDouble();
        weight = mass*gravity;
        if (weight >= 1000)
        {
            System.out.println("The object is too heavy");
        }
        else if (weight > 0 && weight < 10)
        {
            System.out.println("The object is too light");
        }
        else if (weight > 10 && weight < 1000)
        {
            System.out.printf("The object weight is %,.2f", weight);
        }
        else 
        {
            System.out.println("Invalid mass has been entered.");        }

    }
    
}
