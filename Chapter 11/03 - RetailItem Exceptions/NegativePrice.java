public class NegativePrice extends Exception
{
    public NegativePrice()
    {
        super("Error: Can't put negative value to price of an item.");
    }

    public NegativePrice(double Price)
    {
        super("Error: Can't put negative value to price of an item.");
    }   
}
