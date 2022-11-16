import java.util.Scanner;

public class VowelsAndConsonantsDemo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String theWord;
        do
        {
            System.out.print("Please enter the string you like to test: ");
            theWord = keyboard.nextLine();
            if (!(theWord.charAt(0) == 'e'))
            {
                VowelsAndConsonants convertor = new VowelsAndConsonants(theWord);
            convertor.devide();
            int vowelsNum = convertor.getVowels();
            int consNum = convertor.getConsonants();
            System.out.println("The entered string has "+vowelsNum+" vowels.");
            System.out.println("The entered string has "+consNum+" consonants.");
            }
            theWord.trim();
        }while(!(theWord.charAt(0) == 'e') && theWord.length() != 1);
    }
    
}
