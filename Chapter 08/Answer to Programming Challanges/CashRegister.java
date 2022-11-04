public class CashRegister 
{
    private RetailItem newRetail;
    private int quantity; 
    private double subTotal; 
    private double Total; 
    private double tax;  
    private final double taxRate = 0.06;

    public CashRegister(RetailItem theItem, int theQuantity)
    {
        newRetail = new RetailItem(theItem);
        quantity = theQuantity;
    }

    public int getQuantity()
    {
        return quantity;
    }
    
    public double getSubtotal()
    {
        subTotal = newRetail.getPrice()*quantity;
        return subTotal;
    }
    public double getTax()
    {
        tax = taxRate*subTotal;
        return tax;
    }
    public double getTotal()
    {
        Total = tax +subTotal;
        return Total;
    }
}
