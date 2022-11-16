public class TeamLeader extends ProductionWorker
{
    private double monthlyBonus;
    private int RequiredHours;
    private int AttendedHours;
    public TeamLeader(){
    }

    public TeamLeader(String theName, String theEmpNum, String theHireDate, int theShift,
                       double thePayRate, double theMonthlyBonus, int requiedHours, int attendedHours)
    {
    super(theName,theEmpNum,theHireDate,theShift,thePayRate);
    monthlyBonus = theMonthlyBonus;
    RequiredHours = requiedHours;
    AttendedHours = attendedHours;
    }

    public void setMonthlyBonus(double theMonthBonus)
    {
        monthlyBonus = theMonthBonus;
    }
    public void setRequiredHours(int theHours)
    {
        RequiredHours = theHours;
    }
    public void setAttendedHours(int theHours)
    {
        AttendedHours = theHours;
    }

    public double getMonthlyBonus()
    {
        return monthlyBonus;
    }
    public int getAttendedHours()
    {
        return AttendedHours;
    }
    public int getRequiredHours()
    {
        return RequiredHours;
    }

}
