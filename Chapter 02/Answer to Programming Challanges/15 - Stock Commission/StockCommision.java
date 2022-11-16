public class StockCommision 
{
    public static void main(String[] args)
    {
        double price = 21.77;
        int shares = 600;
        double stockPrice ;
        double commision;
        double total;
        final double stockCommission = 0.02;
        stockPrice = shares*price;
        commision = stockCommission*stockPrice;
        total = commision + stockPrice;
        System.out.println("The amount of money paid for the commision is: "+ stockPrice);
        System.out.println("The amount of money paid for the commision is: "+ commision);
        System.out.println("The total amount paid is: "+ total);
    }
    
}
