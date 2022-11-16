public class Payroll 
{
    int[] employeeId = {5658845,4520125,7895122,8777541,8451277,1302850,7580489};
    int[] hours = new int[7];
    double[] payRate = new double[7];
    double[] wages = new double[7];
    public void sethours(int index, int hoursWorked)
    {
        hours[index] = hoursWorked;
    }
    public void setPayRate(int index, double payrate)
    {
        payRate[index] = payrate;
    }

    public int getHours(int index)
    {
        return hours[index];
    }

    public int getID(int index)
    {
        return employeeId[index];
    }

    public double getPayRate(int index)
    {
        return payRate[index];
    }

    public void calculateWages()
    {
        for (int i = 0; i < 7; i++ )
        {
            wages[i] = hours[i]*payRate[i];
        }
    }
    public double getWages(int index)
    {
        return wages[index];
    }
}
