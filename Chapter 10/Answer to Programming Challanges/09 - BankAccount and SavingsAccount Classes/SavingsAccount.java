
public class SavingsAccount extends BankAccount
{
    private boolean status;
    
    public void withdraw(double Amount)
    {
        if (super.getBalance() >= 25)
        status = true;
        else 
        status = false;
        if (status == true)
        super.withdraw(Amount);
    }

    public void deposit(double Amount)
    {
        if ((super.getBalance() + Amount) >= 25)
        status = true;
        else 
        status = false;
        if (status == true)
        super.deposit(Amount);
    }

    public void monthlyProcess()
    {
        if (super.getWithdrawals() > 4)
        super.setMonthlyCharges(super.getWithdrawals()*1);
        else
        super.setMonthlyCharges(0);

        super.monthlyProcess();

        if (super.getBalance() >= 25)
        status = true;
        else 
        status = false;
    }
}
