public class ProductionWorker extends Employee
{
    protected int shift;
    protected double payRate;

    public ProductionWorker()
    {
     
    }
    
    public ProductionWorker(String theName,String theNumber, String hireDate,int theShift, double thePayRate)
    {
        super(theName,theNumber,hireDate);
        shift = theShift;
        payRate = thePayRate;
    }

    public int getShift()
    {
        return shift;
    }
    public double getPayRate()
    {
        return payRate;
    }
    
    public void setShift(int theShift)
    {
        shift = theShift;
    }
    public void setRate(double thePayRate)
    {
        payRate = thePayRate;
    }
}

