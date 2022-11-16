import java.util.Scanner;
import java.util.Random;

public class ESPGame 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random randNumber = new Random();
        
        String color = "";
        String color2;
        int correct=0;
        int number;
        String response;
        do
        {
            for (int num1 = 1; num1 <= 10;num1++)
            {
                number = randNumber.nextInt(4)+1;
            
                if (number == 1)
                {
                    color = "red";
                }
                if (number == 2)
                {
                    color = "green";
                }
                if (number == 3)
                {
                    color = "blue";
                }
                if (number == 4)
                {
                    color = "orange";
                }
                if (number == 5)
                {
                    color = "yellow";
                }
                System.out.println("\nYour choice of colors are");
                System.out.println("red, blue, orange, yellow, green");
                System.out.print("Please guess the color: ");
                color2 = keyboard.nextLine();
                if (color.equals(color2))
                {
                    correct++;
                }
            }
          
            System.out.println("\nYou have guessed "+correct+" correctly out of 10 guesses.");
            System.out.print("\nEnter 'y' if you wish to continue or anything else to stop: ");
            response = keyboard.nextLine();
        }while(response.equals("y"));
    }
}
