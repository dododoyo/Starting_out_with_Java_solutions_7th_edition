import java.util.Scanner;
public class MultipleStockSales 
{
    public static void main(String[] args)
    {
        double profitTotal = 0;
        for (int i = 1; i<=10;i++)
        {
            profitTotal += stockChecker(i);
        }
        System.out.println();
        if (profitTotal>0)
        System.out.printf("The total profit from all of the transactions is: %,.2f",profitTotal);
        
        if (profitTotal<0)
        profitTotal = profitTotal*-1;
        System.out.printf("The total profit from all of the transactions is: %,.2f",profitTotal);
        
        if (profitTotal==0)
        System.out.printf("No profit was made from all of the tranactions.");
    }

    public static double stockChecker(int j)
    {
        System.out.println("\n\nPlease enter data for Stock Transaction "+ j);
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nPlease enter the number of shares: ");
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
        System.out. printf("The total amount of money profited from the transaction is: %,.2f\n",totalProfit);
        
        if (totalProfit < 0)
        totalProfit = totalProfit*-1;
        System.out. printf("The total amount of money lost from the transaction is: %,.2f\n",totalProfit);
        totalProfit = totalProfit*-1;

        if (totalProfit==0)
        System.out. printf("No profit or lost was observed in the transaction.\n",totalProfit);
        
        return totalProfit;
    }


    public static double profitCalculator(double stockNumber, double purchasePrice, double purhcaseCommission, double sellPrice, double saleCommision)
    {
        double theProfit = ((stockNumber*sellPrice)-saleCommision) - ((stockNumber*purchasePrice)+purhcaseCommission);   
        return theProfit; 
    }
    
}
