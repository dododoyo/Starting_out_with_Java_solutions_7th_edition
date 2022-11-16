public class Payroll 
{
    String name ;
    String employeeId ;
    int hoursWorked;
    double payRate;

    public void sethours(int hourWorked)
    {
        hoursWorked = hourWorked;
    }
    public void setPayRate(double payrate)
    {
        payRate = payrate;
    }
    public void setName(String theName)
    {
        name = theName;
    }
    public void setId(String theId)
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
