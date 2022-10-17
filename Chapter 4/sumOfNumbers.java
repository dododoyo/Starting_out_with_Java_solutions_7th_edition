import java.util.Scanner;
public class sumOfNumbers
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int maxValue,holder = 0,number;
        System.out.print("Please enter the last number: ");
        maxValue = keyboard.nextInt();
        for (number= 1;number <= maxValue;number++)
        {
            holder += number;

        }
        System.out.println("Total sum from 1 upto "+maxValue+" is:  "+holder);
    }
}
