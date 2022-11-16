import java.util.Scanner;
public class LargestAndSmallest
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter any interger value or -99 to stop: ");
        int number = keyboard.nextInt();
        int smallest = number, largest = number;
        do
        {
            if (smallest >= number)
            {
                smallest = number;
            }
            if (largest <= number)
            {
                largest = number;
            }
            System.out.print("Please enter any interger value or -99 to stop: ");
            number = keyboard.nextInt();
         } while(number != -99);
        System.out.println("The largest value from the entries is: "+largest);
        System.out.println("The smallest value from the entries is: "+smallest);
    }
}