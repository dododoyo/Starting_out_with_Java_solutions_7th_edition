public class InvalidHours extends Exception
{
    public InvalidHours()
    {
        super("Error: You can't have values greater than 84 or values less than 0 for number of hours worked.");
    }
    
}
