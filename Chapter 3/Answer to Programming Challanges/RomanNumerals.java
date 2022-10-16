import java.util.Scanner;

public class RomanNumerals
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number 1 through 10: ");
        int number =  keyboard.nextInt();
        if (number == 1)
        {
            System.out.println("The number in the Roman Numerals is: I");
        }
        else if (number == 2)
        {
            System.out.println("The number in the Roman Numerals is: II");
        }
        else if (number == 3)
        {
            System.out.println("The number in the Roman Numerals is: III");
        }
        else if (number == 4)
        {
            System.out.println("The number in the Roman Numerals is: IV");
        }
        else if (number == 5)
        {
            System.out.println("The number in the Roman Numerals is: V");
        }
        else if (number == 6)
        {
            System.out.println("The number in the Roman Numerals is: VI");
        }
        else if (number == 7)
        {
            System.out.println("The number in the Roman Numerals is: VII");
        }
        else if (number == 8)
        {
            System.out.println("The number in the Roman Numerals is: VIII");
        }
        else if (number == 9)
        {
            System.out.println("The number in the Roman Numerals is: IX");
        }
        else if (number == 10)
        {
            System.out.println("The number in the Roman Numerals is: X");

        }
        else
        {
            System.out.println("Input is not with in the specified range.");
        }
    }

}
