public class ProductionWorkerModified extends EmployeeModified
{
    protected int shift;
    protected double payRate;

    public ProductionWorkerModified()
    {
    
    }
    
    public ProductionWorkerModified(String theName,String theNumber, String hireDate,int theShift, double thePayRate)
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
    
    public void setShift(int theShift)throws InvalidShift
    {
        if ( theShift != 1 && theShift != 2)
        throw new InvalidShift();
        shift = theShift;
    }
    public void setRate(double thePayRate)throws InvalidPayRate
    {
        if (thePayRate < 0 || thePayRate > 24)
        throw new InvalidPayRate();
        payRate = thePayRate;
    }
}

