import java.util.Scanner;
public class SavingsAccountDemo 
{

    public static void main(String[] args)
    {
        double totalDeposit=0;
        double totalWithdrawals=0;
        double totalinterest=0;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the starting balance of the account: ");
        double start = keyboard.nextDouble();
        System.out.print("What is the annual interest rate of the bank: ");
        double yearInterestRate = keyboard.nextDouble();
        SavingsAccount account1 = new SavingsAccount(start);

        for (int i = 1 ; i<=12; i++)
        {
            System.out.print("\n\nWhat is the amount withdrawn in month "+ i+":");
            double withdrawn = keyboard.nextDouble();
            account1.withdraw(withdrawn);
            totalWithdrawals += withdrawn;
            System.out.print("What is the amount deposited in month "+ i+":");
            double deposited = keyboard.nextDouble();
            account1.deposit(deposited);
            totalDeposit += deposited;
            totalinterest += account1.interest(yearInterestRate);   
        }

        System.out.println("\n\nThe total amount of money deposited from the account is: "+totalDeposit);  
        System.out.println("The total amount of money withdrawn from the account is: "+totalWithdrawals); 
        System.out.printf("The total amount of money earned as an interest form the bank will be: %,.2f\n",totalinterest);   
        System.out.printf("The total amount of money left in the account is: %,.2f",account1.getBallance());
    }
}
