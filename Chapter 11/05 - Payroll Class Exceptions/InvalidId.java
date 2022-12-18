public class InvalidId extends Exception
{
    public InvalidId()
    {
        super("Can't have blank space for the ID of employee");
    }
    public InvalidId(String theId)
    {
        super("Can't have blank space for the ID of employee");
    }
    public InvalidId(int theId)
    {
        super("Can't have negative values or '0' for the ID of employee");
    }  
}

    
