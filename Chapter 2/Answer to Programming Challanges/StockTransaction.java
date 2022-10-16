public class StockTransaction 
{
    public static void main(String[] args)
    {
        final int sharesNumber = 1000;
        final double purchasePerStock = 32.87;
        final double StockBrokerCommission=0.02;
        final double soldPerStock =33.92;
        double totalCommision;
        double totalPurchase;
        double totalSold;
        double purchaseStockbroker;
        double soldStockbroker;
        double profit;
        totalPurchase = sharesNumber*purchasePerStock;
        totalSold = sharesNumber*soldPerStock;
        purchaseStockbroker = totalPurchase*StockBrokerCommission;
        soldStockbroker = totalSold*StockBrokerCommission;
        totalCommision = soldStockbroker + purchaseStockbroker;
        profit = totalSold-totalCommision-totalPurchase;
        System.out.println("The amount of money Joe paid for the stock is: "+ totalPurchase);
        System.out.println("\nThe amount of commission Joe paid for the stockbroker \n when he bought the stock is: "+ purchaseStockbroker);
        System.out.println("\nThe amount of commission Joe paid for the stockbroker \n when he sold the stock is: "+ soldStockbroker);
        System.out.println("\nThe amount of money Joe sold the stock for  is: "+ totalSold);
        System.out.println("\nThe amount of money Joe earned as a profit is: "+ profit);
    }
    
}
