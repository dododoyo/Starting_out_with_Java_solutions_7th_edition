import java.util.Scanner;
public class TimeCalculator 
{
    public static void main(String[] args)
    {
        double second,minute,hour,day;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of seconds: ");
        second = keyboard.nextInt();
        if (second > 0 && second < 60)
        {
            System.out.println("Your input seconds equal to "+second+"seconds.");

        }
        else if (second >= 60 && second <3600)
        {
            hour = second%3600;
            System.out.println("Your input hours equal to "+hour+" hours.");
        }
        else if (second >= 3600 && second < 86400)

        {
            day = second%86400;
            System.out.println("Your input hours equal to "+day+" days.");
        }
    }
    
}
