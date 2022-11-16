public class FirstToOne 
{
    public static void main(String[] args)
    {
        Player player1 = new Player();
        Player player2 = new Player();
        Die die1 = new Die(6);
        Die die2 = new Die(6);
        final int initial = 50;
        player1.setScore(initial);
        player2.setScore(initial);

        System.out.println("\nScore of player 1 is: "+player1.getScore());
        System.out.println("Score of player 2 is: "+player2.getScore());
        
        do 
        {
            player1.rollDice(die1);
            if (player1.getScore() < 0)
            player1.addScore(die1.getValue());
            System.out.println("\nScore of player 1 is: "+player1.getScore());

            
            player2.rollDice(die2);
            if (player2.getScore() < 0)
            player2.addScore(die2.getValue());
            System.out.println("Score of player 2 is: "+player2.getScore());


        }while (player1.getScore()!=1 && player2.getScore()!=1);
        System.out.println();
        if (player1.getScore() ==1 && player2.getScore()!=1)
        {
            System.out.println("Player 1 won this game.");
        }
        else if (player1.getScore() !=1 && player2.getScore() ==1)
        {
            System.out.println("Player 2 won this game.");
        }
        else 
        {
            System.out.println("This game was a draw.");
        }
    }
    
}
