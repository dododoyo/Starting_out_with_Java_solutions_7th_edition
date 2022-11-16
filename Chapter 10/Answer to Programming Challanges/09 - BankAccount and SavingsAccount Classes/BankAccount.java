public abstract class BankAccount 
{
    private double balance;
    private int numOfDeposit;
    private int numOfWithdrawals;
    private double AnnualInterestRate;
    private double serviceCharge;
    private double Interest;

    public BankAccount()
    {
    }

    public BankAccount(double theBalance, double theRate)
    {
        balance = theBalance;
        AnnualInterestRate = theRate;
    }

    public void deposit(double Amount)
    {
        balance += Amount;
        numOfDeposit++;
    }
    public void withdraw(double Amount)
    {
        balance -= Amount;
        numOfWithdrawals++;
    }
    public void calcInterest()
    {
        Interest = balance*(AnnualInterestRate/12);
        balance += Interest;
    }
    public void monthlyProcess()
    {
        balance -= serviceCharge;
        numOfDeposit =0;
        numOfWithdrawals=0;
    }
    public double getBalance()
    {
        return balance;
    }
    public int getWithdrawals()
    {
        return numOfWithdrawals;
    }
    public int getDeposits()
    {
        return numOfDeposit;
    }
    public void setMonthlyCharges(double Amount)
    {
        serviceCharge = Amount;
    }

}



