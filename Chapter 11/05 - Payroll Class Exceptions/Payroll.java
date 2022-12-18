public class Payroll 
{
    String name ;
    String employeeId ;
    int hoursWorked;
    double payRate;

    public void sethours(int hourWorked)throws InvalidHours
    {
        if (hoursWorked < 0 || hoursWorked > 84 )
        throw new InvalidHours();
        else
        hoursWorked = hourWorked;
    }
    public void setPayRate(double payrate)throws InvalidPayRate
    {
        if (payrate < 0 || payrate > 25)
        throw new InvalidPayRate();
        else
        payRate = payrate;
    }
    public void setName(String theName)throws InvalidName
    {
        if (theName.equals(null))
        throw new InvalidName();
        else
        name = theName;
    }
    public void setId(String theId)throws InvalidId
    { 
        employeeId = theId;
    }

    public String getName()
    {
        return name;
    }
    public int getHours()
    {
        return hoursWorked;
    }
    public String getID()
    {
        return employeeId;
    }

    public double getPayRate()
    {
        return payRate;
    }

    public double getGrossPay()
    {
        return payRate*hoursWorked;
    }
}
