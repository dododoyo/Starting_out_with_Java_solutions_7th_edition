public class Customer extends Person
{
    private String customerNumber;
    private boolean onMailList;
    public Customer()
    {}
    public Customer(String theName,String theAddress,String thePhone, String cusNum,boolean mail)
    {
        super(theName, theAddress, thePhone);
        customerNumber = cusNum;
        onMailList = mail;
    }

    public void setCustomerNumber(String theNum)
    {
        customerNumber = theNum;
    }
    public void setMailingPreference(boolean onMail)
    {
        onMailList = onMail;
    }

    public String getCustomerNumber()
    {
        return customerNumber;
    }
    public boolean getMailingPreference()
    {
        return onMailList;
    }

}

