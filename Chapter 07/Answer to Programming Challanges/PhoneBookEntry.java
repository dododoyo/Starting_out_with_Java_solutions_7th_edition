public class PhoneBookEntry 
{
    String name;
    int number;
    public PhoneBookEntry(String theName, int theNumber)
    {
        name = theName;
        number = theNumber;
    }
    public void setName(String theName)
    {
        name = theName;
    }
    public void setNumber(int theNumber)
    {
        number = theNumber;
    }
    public String getName()
    {
        return name;
    }
    public int getNumber()
    {
        return number;
    }
    
}
