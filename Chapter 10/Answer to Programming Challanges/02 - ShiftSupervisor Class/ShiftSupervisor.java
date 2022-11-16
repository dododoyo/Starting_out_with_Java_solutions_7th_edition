public class ShiftSupervisor extends Employee
{
    private double anualSalary;
    private double anualProductionBonus;

    public ShiftSupervisor()
    {

    }
    public ShiftSupervisor(String theName, String theEmpNumber, String theDate, double theSalary, double theBonus)
    {
        super(theName,theEmpNumber,theDate);
        anualSalary = theSalary;
        anualProductionBonus = theBonus;
    }

    public void setSalary(double theSalary)
    {
        anualSalary = theSalary;
    }

    public void setBonus(double theBonus)
    {
        anualProductionBonus = theBonus;
    }

    public double getSalary()
    {
        return anualSalary;
    }
    public double getBonus()
    {
        return anualProductionBonus;
    }
}    


