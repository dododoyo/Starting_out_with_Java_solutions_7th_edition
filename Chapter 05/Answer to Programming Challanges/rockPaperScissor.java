import java.util.Random;
import java.util.Scanner;
public class rockPaperScissor
{
    public static void main(String[] args)
    {
        String prefer;
        do
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Select form 'rock', 'paper' or 'scissors'");
            System.out.print("Please enter your choice: ");
            String playerChoice = keyboard.nextLine();
            playerChoice = playerChoice.toLowerCase();
            int playerNumber = playerchoiceConverter(playerChoice);
            int computerNumber = gameChoice();
            String compuChoice = computerchoiceConverter(computerNumber);
            System.out.println("\nComputer's choice was: "+ compuChoice);
            String winner = winnerIndetify(computerNumber, playerNumber);
            System.out.println(winner+" won the game.\n\n");
            System.out.print("Enter 'y' to continue or anything else if you wish to stop: ");
            prefer = keyboard.nextLine();

        }while (prefer.equals("y"));
        
    }


    public static int gameChoice()
    {
        Random rand = new Random();
        int number = rand.nextInt(3);
        return number;
    }
    public static int playerchoiceConverter(String theChoice)
    {
        int converted;
        if (theChoice.equals("rock"))
        converted = 0;
        else if (theChoice.equals("paper"))
        converted = 1;
        else 
        converted = 2;
        return converted;

    }
    public static String computerchoiceConverter(int theChoice)
    {
        String converted;
        if (theChoice ==0)
        converted = "rock";
        else if (theChoice == 1)
        converted = "paper";
        else 
        converted = "scissor";
        return converted;
    }


    public static String winnerIndetify(int computer,int player)
    {
        String winner;
        if ((computer==0 && player == 2) || (computer == 1)&& (player == 0)|| (computer == 2 && player == 1))
        winner = "Computer";
        else if (computer==player)
        winner  = "Nobody";
        else
        winner = "Player";
        return winner;
    }
}