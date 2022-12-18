public class InvalidPayRate extends Exception
{
    public InvalidPayRate()
    {
        super("Error: Payrate can't be greater than 24 or negative number");
    }
    
}
