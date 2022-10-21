import java.util.Scanner;
public class MonthDaysDemo 

{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a month (1-12) : ");
        int themonth = keyboard.nextInt();
        System.out.print("Enter a year: ");
        int theyear = keyboard.nextInt();
        MonthDays tester = new MonthDays(theyear, themonth);
        int days = tester.numberOfDays();
        System.out.println(days+" days" );
    
    }
    
}
