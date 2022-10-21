import java.io.*;
import java.util.Scanner;
public class DepositWithdrawalFiles
{
    public static void main(String[] args)throws FileNotFoundException
    {
        double theAmmount = 0;
        SavingsAccount account2 = new SavingsAccount(500);
        File withdrawFile = new File("Withdrawals.txt");
        File depositFile = new File("Deposits.txt");
        Scanner withdrawScan = new Scanner(withdrawFile);
        Scanner depositScan = new Scanner(depositFile);

        while (depositScan.hasNext())
        {
        theAmmount = Double.parseDouble(depositScan.nextLine());
        account2.deposit(theAmmount);
        }

        while (withdrawScan.hasNext())
        {
        theAmmount = Double.parseDouble(withdrawScan.nextLine());
        account2.withdraw(theAmmount);
        }

        withdrawScan.close();
        depositScan.close();
        int annualInterest = 15;
        double totalInterest = account2.interest(annualInterest);
        System.out.printf("\n\nThe total interest earned in this month is: %,.2f\n",totalInterest);
        System.out.printf("The total balance in this month is: %,.2f",account2.getBallance());
    }
}