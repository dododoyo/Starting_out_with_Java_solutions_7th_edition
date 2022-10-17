import java.util.Scanner;

public class BudgetAnalysis 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the amount of money you have budgeted for the month: ");
        double money = keyboard.nextDouble();
        System.out.println();
        double total=0.0, left,response;
        int number = 1;

        do
        {
            System.out.print("Please enter expense amount for item "+number+" or -1 if you wish to stop: ");
            response= keyboard.nextDouble();
            total += response;
            number++;
            

        }while(response != -1);

        left = money - total;
        if (left > 0)
        {
            System.out.println("\nYour budget is over the amount of expenses by a value of: "+ left);
        }
        else 
        {
            System.out.println("\nYour budget is under the amount of your expenses.");
        }
    }
    
}
