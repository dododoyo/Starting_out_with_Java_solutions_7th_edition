import java.util.Scanner;
public class penniesforPay 
{
    public static void main(String[] args)
    {
        int days,increasingDays=1;
        double totalpennie= 0,pennies = 1,totalCash;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of days worked: ");
        days = keyboard.nextInt();
        System.out.println("Day \t\t Total Cash");
        System.out.println("----------------------------");
        while(increasingDays<=days)
        {
            totalpennie += pennies;
            totalCash = totalpennie/100;
            pennies *= 2;
            System.out.println(increasingDays+" \t\t "+totalCash);
            increasingDays++;

        }


    }
    
}
