import java.util.Scanner;
import java.util.Random;
public class EnhancedRandomNumberGame 
{
    public static void main(String[] args)
    {
        String ch="";
        int counter = 0;
        do
        {
            Scanner keyboard = new Scanner(System.in);
            Random number = new Random();
            int number1 = number.nextInt(100)+1;
            System.out.print("Guess a number from 1 upto 100: ");
            int number2 = keyboard.nextInt();
            while(number1!=number2) 
            {
                if (number1 < number2)
                {
            
                System.out.println("Too high, try again.");
                System.out.print("Guess a number from 1 upto 100: ");
                number2 = keyboard.nextInt();
                }

                else if (number1 > number2)
                {
                System.out.println("Too low, try again.");
                System.out.print("Guess a number from 1 upto 100: ");
                number2 = keyboard.nextInt();
                }
                counter++;
            }
            System.out.println("\nCongratulations, you guessed the number correctly.");
            System.out.println("You entered the correct answer after "+counter+" tries.");
            System.out.print("\nPlease enter 'y' if you wish to continue, or any other value if you wish to stop: ");
            keyboard.nextLine();
            String response = keyboard.nextLine();
            ch = response.toLowerCase();
            System.out.println();
        } while (ch.equals("y"));
    }
}
