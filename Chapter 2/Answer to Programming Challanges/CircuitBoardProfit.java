import java.util.Scanner;
public class CircuitBoardProfit 
{
    public static void main(String[] args)
    {
        double retailPrice;
        final double profitRate = 0.4;
        double profit;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the retail price of the circuit board: ");
        retailPrice = keyboard.nextDouble();
        profit = retailPrice*profitRate;
        System.out.println("The total profit earned from the profit will be: "+ profit);
    }
    
}
