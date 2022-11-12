import java.util.Scanner;
public class SumDigits 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the digits to be added: ");
        String theNum = keyboard.nextLine();
        char[] numArray = theNum.toCharArray();
        int total = 0;
        for (char val:numArray)
        {
            total += Character.getNumericValue(val);
        }
        System.out.println("The total sum of the entered numbers is: "+total);
    }  
}
