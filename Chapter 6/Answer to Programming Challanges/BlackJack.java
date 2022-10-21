import java.util.Scanner;

public class BlackJack 
{
    public static void main(String[] args)
    {
        int compsum = 0;
        int playsum = 0;
        String response;

        Scanner keyboard = new Scanner(System.in);
        Die theDie = new Die(6);


        do
        {
            compsum = 0;
            playsum = 0;
            while ((compsum < 21) && (playsum < 21)) 
            {         
            theDie.roll();
            int comp1 = theDie.getValue();
            theDie.roll();
            int comp2 = theDie.getValue();
            theDie.roll();
            int player1 = theDie.getValue();
            theDie.roll();
            int player2 = theDie.getValue();
            compsum += comp1+comp2;
            playsum += player1+player2;
            }

            if (compsum<=21 && playsum >21)
            {
            System.out.println("\nThe computer won this game.\n");
            System.out.println("The computer's score was: "+compsum);
            System.out.println("The Player's score was: "+playsum);
            }

            else if ((compsum>21) && (playsum <= 21))
            {
            System.out.println("\nYou won this game.\n");
            System.out.println("The computer's score was: "+compsum);
            System.out.println("The Player's score was: "+playsum);
            }

            else if ((compsum==21) && (playsum == 21))
            {
            System.out.println("\nThe game was a tie.\n");
            System.out.println("The computer's score was: "+compsum);
            System.out.println("The Player's score was: "+playsum);
            }

            else 
            {
                System.out.println("\nNo body won this game.");
            }
            
            System.out.print("\nPlease enter 'y' if you wish to continue or anything else if you wish to stop: ");
            response = keyboard.nextLine();
            System.out.println(response);
        } while ((response.equals("y")));
    }
}
