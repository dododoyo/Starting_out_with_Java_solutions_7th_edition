public class Ship 
{
    private String name;
    private String builtYear;

    public Ship()
    {}
    public Ship(String theName, String theYear)
    {
        name = theName;
        builtYear = theYear;
    }
    
    public void setName(String theName)
    {
        name = theName;
    }
    public void setBuiltYear(String theYear)
    {
        builtYear = theYear;
    }

    public String getName()
    {
        return name;
    }
    public String getBuiltYear()
    {
        return builtYear;
    }

    public String toString()
    {
        return "The name of the ship is "+ name +"\n"+
               "The ship was built in the year " + builtYear;
    }
    
}
