import java.util.Scanner;
public class SalesTax 
{
    public static void main(String[] args)
    {
        double purchase;
        double stateSalesTax;
        double countySalesTax;
        final double statetaxrate = 0.04;
        final double countytaxrate = 0.02;
        double totalTax;
        double totalSales;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your total puchase: ");
        purchase = keyboard.nextDouble();
        stateSalesTax = statetaxrate*purchase;
        countySalesTax = countytaxrate*purchase;
        totalTax = stateSalesTax + countySalesTax;
        totalSales = totalTax + purchase;
        System.out.print("\n1000The amount of puchase is: $");
        System.out.println(purchase);
        System.out.print("The State sales tax is: $");
        System.out.println(stateSalesTax);
        System.out.print("The county sales tax is: $");
        System.out.println(countySalesTax);
        System.out.print("The Total sales tax is: $");
        System.out.println(totalTax);
        System.out.print("The Total sales value is: $");
        System.out.println(totalSales);

    }
    
}
