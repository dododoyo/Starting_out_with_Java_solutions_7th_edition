public class RetailItem 
{
    String description;
    int UnitsOnHand;
    double price;
    public RetailItem(String theDescription, int theUnits, double thePrice)throws NegativePrice, NegativeUnits
    {
        if (theUnits < 0)
        {
            throw new NegativeUnits();
        }
        if (thePrice < 0)
        {
            throw new NegativePrice();
        }
       
        description = theDescription;
        UnitsOnHand = theUnits;
        price = thePrice;
    }

    public String getDescription()
    {
        return description;
    }
    public int getUnits()
    {
        return UnitsOnHand;
    }
    public double getPrice()
    {
        return price;
    }

    public void setDescription(String theDescription)
    {
        description = theDescription;
    }
    public void setUnits(int theUnits) throws NegativeUnits
    {
        if (theUnits < 0)
        {
            throw new NegativeUnits();
        }
        UnitsOnHand = theUnits;
    }
    public void setPrice (int thePrice)throws NegativePrice
    {
        if (thePrice < 0)
        {
            throw new NegativePrice();
        }
        price = thePrice;
    }
}
