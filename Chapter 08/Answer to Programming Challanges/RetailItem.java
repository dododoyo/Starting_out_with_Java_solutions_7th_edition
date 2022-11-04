public class RetailItem 
{
    String description;
    int UnitsOnHand;
    double price;
    public RetailItem(String theDescription, int theUnits, double thePrice)
    {
        description = theDescription;
        UnitsOnHand = theUnits;
        price = thePrice;
    }
    public RetailItem(String theDescription, double thePrice)
    {
        description = theDescription;
        UnitsOnHand = 0;
        price = thePrice;
    }
    public RetailItem(RetailItem theItem)
    {
        description = theItem.getDescription();
        UnitsOnHand = theItem.getUnits();
        price = theItem.getPrice();
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
    public void setUnits(int theUnits)
    {
        UnitsOnHand = theUnits;
    }
    public void setPrice (int thePrice)
    {
        price = thePrice;
    }
}
