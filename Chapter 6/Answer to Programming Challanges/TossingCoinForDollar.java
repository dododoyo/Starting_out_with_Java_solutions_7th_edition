public class TossingCoinForDollar 
{
    public static void main(String[] args)
    {
        Coin Quarter = new Coin();
        Coin Dime = new Coin();
        Coin Nickel = new Coin();
        double totalMoney = 0;
        do{
            Quarter.toss();
            Dime.toss();
            Nickel.toss();
            if (Quarter.getSideUp()== "heads")
            totalMoney += 0.25;
            if (Dime.getSideUp()== "heads")
            totalMoney += 0.10;
            if (Nickel.getSideUp()== "heads")
            totalMoney += 0.20;
            
        }while ((totalMoney<1.0));
        
        System.out.printf("The total amount accumulated is: %,.2f\n",totalMoney);
        if (totalMoney==1.0)
        System.out.println("You won this game.");
        else 
        System.out.println("You lost this game.");
    }
    
}
