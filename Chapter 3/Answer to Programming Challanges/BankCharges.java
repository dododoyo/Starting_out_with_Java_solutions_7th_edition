import java.util.Scanner;
public class BankCharges 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int baseFee = 10, checkNumber;
        double serviceFee,checkrate;
        System.out.print("Please enter the number of checks written for the month: ");
        checkNumber = keyboard.nextInt();
        if (checkNumber>0 && checkNumber<20)
        {
            checkrate = 0.1;
        }
        else if (checkNumber >= 20 && checkNumber<39)
        {
            checkrate = 0.08;
        }
        else if (checkNumber >= 40 && checkNumber < 59)
        {
            checkrate = 0.06;
        }
        else if (checkNumber> 60)
        {
            checkrate = 0.04;
        }
        else {
            System.out.println("Invalid input");
            checkrate = 0;
        }
        serviceFee = baseFee + (checkNumber*checkrate);
        System.out.println("The total service charge for this month is: "+ serviceFee);
    }   
}
