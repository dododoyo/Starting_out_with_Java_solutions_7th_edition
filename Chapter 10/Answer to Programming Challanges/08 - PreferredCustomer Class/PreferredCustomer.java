public class PreferredCustomer extends Customer
{ 
    private double discount;
    public PreferredCustomer()
    {}

    public PreferredCustomer(String theName,String theAddress,String thePhone, 
                            String cusNum, boolean onMail, double theDiscount )
    {
        super(theName, theAddress, thePhone,cusNum,onMail);
        discount = theDiscount;
    }
    public void setDiscount(double totalPurchase)
    {
        if (totalPurchase >= 500 && totalPurchase <= 1000)
        discount = 0.05;
        else if (totalPurchase >= 1000 && totalPurchase <= 1500)
        discount = 0.06;
        else if (totalPurchase >= 1500 && totalPurchase <= 2000)
        discount = 0.07;
        else if (totalPurchase >= 2000)
        discount = 0.10;
        else 
        discount = 0;
    }
    public double getDiscount()
    {
        return discount;
    }

}