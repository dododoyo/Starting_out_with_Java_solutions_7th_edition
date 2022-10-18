import java.util.Scanner;
import java.util.Random;
public class ESPGame 
{
    public static void main(String[] args)
    {
        String prefer = "y";
        Scanner keyboard = new Scanner(System.in);
        do
        {
            int counter = 0;
            for (int i = 1 ; i <=10;i++)
            {
                Random rand = new Random();
                int computerchoice = rand.nextInt(5);
                System.out.println("\n\nYour color choices are 'green', 'blue', 'red', 'yellow', or 'orange'");
                System.out.print("Please enter the color of your choice: ");
                String playerChoice = keyboard.nextLine();
                playerChoice = playerChoice.toLowerCase();
                String computerWord = computerchoiceConverter(computerchoice);
                System.out.println("Computer choice was "+ computerWord);
                counter += winningAdder(computerWord, playerChoice);
            }
            System.out.println("\nYou guessed "+counter+" times correctly out of 10 tries.\n");
            System.out.print("Please enter 'y' to continue or anything else to stop: ");
            prefer = keyboard.nextLine();
        }while (prefer.equals("y"));
    }


    
    public static String computerchoiceConverter(int theChoice)
    {
        String converted;
        if (theChoice ==0)
        converted = "red";
        else if (theChoice == 1)
        converted = "green";
        else if (theChoice == 2)
        converted = "blue";
        else if (theChoice ==3 )
        converted = "orange";
        else 
        converted = "yellow";
        return converted;
    }


    public static int winningAdder(String computerChoice, String playerChoice)
    {
        if (computerChoice.equals(playerChoice))
        return 1;
        else 
        return 0;
    }
}
