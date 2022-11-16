public class Person 
{
    private String name;
    private String address;
    private String telephone;

    public Person()
    {

    }
    public Person(String theName,String theAddress,String thePhone)
    {
        name = theName;
        address = theAddress;
        telephone = thePhone;
    }

    public void setName(String theName)
    {
        name = theName;
    }
    public void setAddress(String theAddress)
    {
        address = theAddress;
    }
    public void setPhoneNumber(String thePhone)
    {
        telephone = thePhone;
    }

    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public String getPhone()
    {
        return telephone;
    }

}
