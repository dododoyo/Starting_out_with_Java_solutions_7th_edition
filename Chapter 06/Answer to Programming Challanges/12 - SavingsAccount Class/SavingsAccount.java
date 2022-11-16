public class SavingsAccount 
{
    private double ballance;
    private double anualInterestRate;
    public SavingsAccount(double StartingBallance)
    {
        ballance = StartingBallance;
        
    }


    public void withdraw(double withdrawAmount)
    {
        ballance -= withdrawAmount;
    }
    public void deposit(double depositAmount)
    {
        ballance += depositAmount;
    }
    public double interest(double AnnualRate)
    {
        double percentmonth = (AnnualRate/1200);
        double interest = ballance*(percentmonth);
        ballance += interest;
        return interest;
    }
    public void setBallance(double theBallance)
    {
        ballance = theBallance;
    }
    public void setInterestRate(double theRate)
    {
        anualInterestRate = theRate;
    }
    
    public double monthlyRate()
    {
        double monthlyRate = anualInterestRate/12;
        return monthlyRate;
    }
    public double getBallance()
    {
        return ballance;
    }
    public double getRate()
    {
        return anualInterestRate;
    }
}
