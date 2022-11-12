import java.util.Scanner;
public class BackwardString 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the word you want to print reversed: ");
        String word = keyboard.nextLine();
        reverse(word);
    }

    public static void reverse(String theWord)
    {
        int length = theWord.length();
        for (int i = 0; i < theWord.length(); i++)
        {
            int j = length-1-i;
            System.out.print(theWord.charAt(j));
        }

    }
    
}
