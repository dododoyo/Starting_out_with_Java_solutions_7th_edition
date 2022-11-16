import java.util.Random;
public class DiceGame 
{
    public static void main(String[] args)
    {
        Random randComp = new Random();
        Random randPlay = new Random();
        int totalPlayerDie = 0;
        int totalCompDie = 0;
        for (int i =1 ; i<= 10; i++)
        {
        int  compDie = randComp.nextInt(6);
        int  playDie = randPlay.nextInt(6);
        if (compDie>playDie)
        totalCompDie++;
        if (compDie<playDie)
        totalPlayerDie++;
        
        }
        if (totalCompDie>totalPlayerDie)
        System.out.println("The grand winner of this game is the computer.");
        else if (totalCompDie<totalPlayerDie)
        System.out.println("The grand winner of this game is the player.");
        else 
        System.out.println("This game was a tie.");
    }
    
    
}
