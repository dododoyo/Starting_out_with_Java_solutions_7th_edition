import java.util.Scanner;
public class WordSeparator 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the sentence to be converted: ");
        String theSentence = keyboard.nextLine();
        
        String convertedSentence = separator(theSentence);

        System.out.println("\nThe converted sentence will be: ");
        System.out.println(convertedSentence);

    }
    public static String separator(String theString)
    {
        String sentence = theString;
        char[] length = sentence.toCharArray();
        int counter = 0;
        for(char val:length)
        {
            counter++;
        }
        StringBuilder str = new StringBuilder(sentence);
        for (int i = 0; i < counter ; i++)
        {
            sentence = str.toString();
            if (Character.isUpperCase(sentence.charAt(i)) && i == 0)
            continue;
            
            else if ((Character.isUpperCase(sentence.charAt(i)) && i != 0))
            {
                str.insert(i, ' ');
                str.insert(i+1, Character.toLowerCase(sentence.charAt(i)) );
                str.delete(i+2, i+3);
            }
        
        }
        return sentence;
    } 
}
