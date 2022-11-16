public class HeadsOrTails 
{
    public static void main(String[] args)
    {
        Coin  gameCoin = new Coin();
        String facingUp = " ";
        Player player1 = new Player();
        Player player2 = new Player();
        int toss = 1;
        
        do 
        {
            gameCoin.toss();
            facingUp = player1.tossCoin(gameCoin);
            gameCoin.toss();
            if (facingUp.equals(gameCoin.getSideUp()))
            {
                player1.addScore(1);
            }
            System.out.println("\nThis is toss: "+toss);
            System.out.println("\nThe coin was facing "+ facingUp);
            System.out.println("Player one's guess was "+ gameCoin.getSideUp());
            System.out.println("Player one's score is "+ player1.getScore());

            gameCoin.toss();
            facingUp = player2.tossCoin(gameCoin);
            gameCoin.toss();
            if (facingUp.equals(gameCoin.getSideUp()))
            {
                player2.addScore(1);
            }
            
            System.out.println("The coin was facing "+ facingUp);
            System.out.println("Player two's guess was "+ gameCoin.getSideUp());
            System.out.println("Player two's score is "+ player2.getScore());
            toss++;

        }while(player1.getScore() < 5 && player2.getScore() < 5);
        System.out.println();
        if (player1.getScore() ==5 && player2.getScore()!=5)
        {
            System.out.println("Player 1 won this game.");
        }
        else if (player1.getScore() !=5 && player2.getScore() ==5)
        {
            System.out.println("Player 2 won this game.");
        }
        else 
        {
            System.out.println("This game was a draw.");
        }
    }
    
    
}
