import java.util.Scanner;
public class SpeedOfSound 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int airSpeed = 1100;
        int waterSpeed = 4900;
        int steelSpeed = 16400,soundSpeed;
        String medium;
        double time,distance;
        System.out.println("Please enter the medium of the sound");
        System.out.print("Please enter either 'air', 'water' or 'steel' : ");
        medium = keyboard.nextLine();
        medium = medium.toLowerCase();
        System.out.print("Please enter the total distance the sound wave will travel in feet: ");
        distance = keyboard.nextInt();
        if (medium.equals("air"))
        {
            soundSpeed = airSpeed;
        }
        else if (medium.equals("water"))
        {
            soundSpeed = waterSpeed;
        }
        else if (medium.equals("steel"))
        {
            soundSpeed = steelSpeed;
        }
        else 
        {
            System.out.println("Invalid Input");
            soundSpeed = 1;
            distance = 0; 
        }
        time = distance/soundSpeed;
        System.out.printf("The time sound will take to travel "+distance+" feet "+medium+" is %,.2f seconds.",time);
    }   
}
