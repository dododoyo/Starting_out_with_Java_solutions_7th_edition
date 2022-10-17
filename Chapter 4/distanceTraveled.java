import java.util.Scanner;
public class distanceTraveled 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double speed,time,distance;
        System.out.print("Please enter the speed of the vehicle in MPH: ");
        speed = keyboard.nextInt();
        while (speed < 0)
        {
            System.out.print("Invalid speed value has been entered.");
            System.out.print("Please enter the speed of the vehicle in MPH: ");
            speed = keyboard.nextInt();
        }
        System.out.print("Please enter the number of hours it has traveled: ");
        time = keyboard.nextInt();

        while (speed < 1)
        {
            System.out.print("Invalid time value has been entered.");
            System.out.print("Please enter the number of hours it has traveled: ");
            time = keyboard.nextInt();
        }
        System.out.println("Hour \t\t Distance Traveled");
        System.out.println("-----------------------------------");
        for(int new_time = 1;new_time<=time;new_time++)
        {
            distance = new_time*speed;
            System.out.println(new_time+" \t\t  "+distance);
        }


    }
    
}
