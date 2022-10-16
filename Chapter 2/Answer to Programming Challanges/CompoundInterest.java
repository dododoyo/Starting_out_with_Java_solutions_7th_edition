import java.util.Scanner;
public class CompoundInterest 
{
    public static void main(String[] args)
    {
        double principal;
        double interestRate;
        double perYear;
        double Year;
        double new1;
        double new2;
        double new3;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the principal originally deposited: ");
        principal = keyboard.nextDouble();
        System.out.print("Please enter the interest rate paid for the account in percentage: ");
        interestRate = keyboard.nextDouble();
        interestRate = (interestRate)/100;
        System.out.print("Please enter the number of times per year to be componded: ");
        perYear = keyboard.nextDouble();
        System.out.print("Please enter the number of years the account will be left over: ");
        Year = keyboard.nextDouble();
        new2 = (perYear*Year);
        new3 = Math.pow((1+(interestRate/perYear)),new2);
        new1 = principal*new3;
        System.out.println("\nThe amount of money that will be in the account after "+
        "\n the specified number of years is: "+new1);
    }
    
}
