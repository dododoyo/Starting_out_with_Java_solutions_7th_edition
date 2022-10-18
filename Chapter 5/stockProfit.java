import java.util.Scanner;
public class stockProfit 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of shares: ");
        double stockNumber = keyboard.nextDouble();
        System.out.print("Please enter price of each stock when bought: ");
        double stockPriceBuy = keyboard.nextDouble();
        System.out.print("Please commission paid when buying: ");
        double buyCommission = keyboard.nextDouble();
        System.out.print("Please enter price of each stock when sold: ");
        double stockPricesell = keyboard.nextDouble();
        System.out.print("Please commission paid when selling: ");
        double sellCommission = keyboard.nextDouble();
        double totalProfit = profitCalculator(stockNumber, stockPriceBuy, buyCommission, stockPricesell, sellCommission);
        if (totalProfit > 0)
        System.out. printf("The total amount of money profited from the transaction is: %,.2f",totalProfit);
        if (totalProfit < 0)
        totalProfit = totalProfit*-1;
        System.out. printf("The total amount of money lost from the transaction is: %,.2f",totalProfit);
        if (totalProfit==0)
        System.out. printf("No profit or lost was observed in the transaction.",totalProfit);
    }


    public static double profitCalculator(double stockNumber, double purchasePrice, double purhcaseCommission, double sellPrice, double saleCommision)
    {
        double theProfit = ((stockNumber*sellPrice)-saleCommision) - ((stockNumber*purchasePrice)+purhcaseCommission);   
        return theProfit; 
    }
}
