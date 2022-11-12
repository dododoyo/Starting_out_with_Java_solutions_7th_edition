import java.util.Scanner;
public class SumNumbers 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("You should type the numbers separated by comma. like 2,5,3,1 . . .");
        System.out.print("Please enter the numbers to be added in the given format: ");
        String numbers = keyboard.nextLine();
        String[] numbersArray = numbers.split(",");
        int total = 0;
        for (String val:numbersArray)
        {
            int number = Integer.valueOf(val);
            total += number;
        }
        System.out.println("The total sum of the entered numbers is: "+total);
    }    
}
