import java.util.Scanner;
public class retailPriceCalculator 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double price,markupPercentage,retailPrice;
        System.out.print("Please enter item's wholesale cost: ");
        price = keyboard.nextDouble();
        System.out.print("Please enter item's markup percentage in percents: ");
        markupPercentage = keyboard.nextDouble();
        retailPrice = calculateRetail(price,markupPercentage);
        System.out.printf("Items retail price is: %,.2f",retailPrice);
    }
    public static Double calculateRetail(double thePrice,double thePercent)
    {
        double totalValue = thePrice*(1+(thePercent)/100);
        return totalValue;
    }   
}
