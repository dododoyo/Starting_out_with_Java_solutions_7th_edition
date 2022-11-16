import java.util.Scanner;
public class WordCounter 
{
    public static void main(String[] args)
    {
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Please enter the String you like to check: ");
     String sentence = keyboard.nextLine();
     System.out.println("The string has "+ counter(sentence)+" words in it.");

    }

    public static int counter(String theSentence)
    {
        int count = 1;
        char[] array = theSentence.toCharArray();
        for (int i=0 ; i < theSentence.length();i++)
        {

            if (Character.isWhitespace(array[i]))
            count++;
        }
        return count;

    }
    
}
