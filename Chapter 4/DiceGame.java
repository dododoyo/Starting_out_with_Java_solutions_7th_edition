import java.util.Scanner;

import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;

import java.util.Random;
public class DiceGame 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String response;
        Random rand = new Random();
        int randnum1;
        int randnum2;
        do 
        {
            int computerWins=0,playerWins=0;
            for (int num=1;num<=10;num++)
            {
                randnum1 = rand.nextInt(6);
                randnum2 = rand.nextInt(6);

                if (randnum1>randnum2)
                playerWins++;
                if (randnum1<randnum2)
                computerWins++;
            }
            System.out.print("Please enter 'y' , or anything else if you wish to stop: ");
            response = keyboard.nextLine();
            if (playerWins>computerWins)
            {
                System.out.println("Player is the Grand Winner.");
            }
            if (playerWins<computerWins)
            {
                System.out.println("Computer is the Grand Winner.");
            }
            if (playerWins==computerWins)
            {
                System.out.println("The game was a tie.");
            }
            System.out.println();
        }while (response.equals("y"));
    }
}
