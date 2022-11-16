import java.util.Scanner;
import java.io.*;
public class DistanceFile
{
    public static void main(String[] args)throws FileNotFoundException
    {
        // With sample speed 40MPH and number of hours 5.
        Scanner keyboard = new Scanner(System.in);
        double speed,time,distance;
        PrintWriter printer = new PrintWriter("DistanceFile.txt");
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
        printer.println("Hour \t\t Distance Traveled");
        printer.println("-----------------------------------");
        for(int new_time = 1;new_time<=time;new_time++)
        {
            distance = new_time*speed;
            printer.println(new_time+"   \t\t     "+distance);
        }
        printer.close();
    }
    
}
