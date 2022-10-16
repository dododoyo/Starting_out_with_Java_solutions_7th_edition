import java.util.Scanner;
public class MagicDates 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int day,month,year,multiple;
        System.out.print("Please enter the Day is numeric form: ");
        day = keyboard.nextInt();
        System.out.print("Please enter the Month is numeric form: ");
        month = keyboard.nextInt();
        System.out.print("Please enter the last two digit of the year: ");
        year = keyboard.nextInt();
        multiple = day*month;
        if (multiple == year)
        System.out.println("The date is magic.");
        else
        System.out.println("The date is NOT magic.");
    }
    
}
