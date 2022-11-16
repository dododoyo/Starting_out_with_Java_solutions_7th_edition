public class coinDemo 
{
    public static void main(String[] args)
    {
        Coin dime = new Coin();
        System.out.println("The coin is initially facing: "+ dime.getSideUp()+"\n\n");
        int totalHead = 0;
        for (int i=0; i <=20; i++)
        {
            dime.toss();
            System.out.println("The coin is currently facing: "+dime.getSideUp());
            if (dime.getSideUp().equals("heads"))
            totalHead++;
        }
        System.out.println("\nOut of 20 trials the coin turned heads "+totalHead+" times.");
        System.out.println("Out of 20 trials the coin turned tails "+(20-totalHead)+" times.");
    }
    
}
