public class Employee
{
    protected String name;
    protected String empnumber;
    protected String hireDate;
    public Employee()
    {
        
    }
    public Employee(String theName, String employeeNumber, String theHireDate)
    {
        name = theName;
        empnumber = employeeNumber;
        hireDate = theHireDate;
    }
    public void setName(String theName)
    {
        name = theName;
    }
    public void setEmployeeNumber(String theEmpNum)
    {
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