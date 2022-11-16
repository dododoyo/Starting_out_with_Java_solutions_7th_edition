import java.util.Scanner;

public class PigLatin 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter the setence to be translated to pig latin: ");
        String theSentence = kb.nextLine();
        String translated = Pig(theSentence);
        System.out.println("The sentence after conversion will be:");
        System.out.println(translated);  
    }
    
    public static String Pig(String str)
    {
        String[] wordArray = str.split(" ");
        StringBuilder converted = new StringBuilder();
        int length = 0;

        for (String val: wordArray)
        length++;

        for (int i = 0; i < length ; i++)
        {
            char firstChar = wordArray[i].charAt(0);
            StringBuilder builder = new StringBuilder(wordArray[i]);

            builder.delete(0, 1);
            builder.append(firstChar);
            builder.append('A');
            builder.append('Y');
            converted.append(builder.toString()+' ');
        }
        return converted.toString();
    }    
}
