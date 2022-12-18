public class EmployeeModified
{
    protected String name;
    protected String empnumber;
    protected String hireDate;
    public EmployeeModified()
    {
        name = null;
        empnumber = null;
        hireDate = null;
    }
    public EmployeeModified(String theName, String employeeNumber, String theHireDate)
    {
        name = theName;
        empnumber = employeeNumber;
        hireDate = theHireDate;
    }
    public void setName(String theName)
    {
        name = theName;
    }
    public void setEmployeeNumber(String theEmpNum)throws InvalidEmployeeNumber
    {
        if(!isValid(theEmpNum))
        throw new InvalidEmployeeNumber();
        empnumber = theEmpNum;
    }
    public void setHireDate(String theDate)
    {
        hireDate = theDate;
    }
    public String getName()
    {
        return name;
    }
    public String getEmployeeNumber()
    {
        return empnumber;
    }
    public String getHiredDate()
    {
        return hireDate;
    }

    public static boolean isValid(String empNum)
    {
        boolean goodSoFar = true;
        if (!Character.isDigit(empNum.charAt(0)))
        goodSoFar = false;
        if (!Character.isDigit(empNum.charAt(1)))
        goodSoFar = false;
        if (!Character.isDigit(empNum.charAt(2)))
        goodSoFar = false;
        if (!Character.isLetter(empNum.charAt(3)))
        goodSoFar = false;
        return goodSoFar;
    }


    
}