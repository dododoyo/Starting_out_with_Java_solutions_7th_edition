import java.util.Scanner;
public class KineticEnergy 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the mass of the object in kG: ");
        double mass = keyboard.nextDouble();
        System.out.print("Please enter the velocity of the object in m/s: ");
        double velocity = keyboard.nextDouble();
        double kineticenergy = kineticEnergy(mass, velocity);
        System.out.printf("\nThe kinetic energy of the system is: %,.2f Joules\n",kineticenergy);

    }
    
    public static double kineticEnergy(double mass, double velocity)
    {
        double kinetic = 0.5*(mass*velocity*velocity);
        return kinetic;
    }
}
