import java.util.Scanner;
public class presentValue 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the desired Future value: ");
        double futureValue = keyboard.nextDouble();
        System.out.print("Please enter the annual interest rate as percentage: ");
        double interestRate = keyboard.nextDouble();
        interestRate = interestRate/100;
        System.out.println("Please enter the number of years to be left");
        int years = keyboard.nextInt();
        double presentValues = presentvalue(futureValue, interestRate, years);
        System.out.printf("\n\nThe amount of money to start with today will be: %,.2f\n\n",presentValues);

    }
    public static double presentvalue(double futureValue,double anualRate,int yearsNum)
    {
        double num1 = Math.pow((1+anualRate),yearsNum);
        double present = futureValue/num1;
        return present;
    }

    
}
