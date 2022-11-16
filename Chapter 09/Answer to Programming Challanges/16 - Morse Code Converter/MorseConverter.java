import java.util.Scanner;
public class MorseConverter 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter the string to be converted: ");
        String theString = kb.nextLine();
        String convert = stringChange(theString);
        System.out.println("When converted to string the entered code will be: ");
        System.out.println(convert);
    }


    public static String stringChange(String theString)
    {
        StringBuilder convertedString = new StringBuilder();
        char[] wordArray = theString.toCharArray();
        for (char letter: wordArray)
        {
            String convLetter = Charchange(letter);
            convertedString.append(convLetter);
        }
        return convertedString.toString();
    }


    public static String Charchange(char letter)
    {
        String converted = "";         
        if (Character.toLowerCase(letter) == 'a' )
        converted = ".-";
        else if (Character.toLowerCase(letter) == 'b' )
        converted = "-...";
        else if (Character.toLowerCase(letter) == 'c' )
        converted = "-.-.";
        else if (Character.toLowerCase(letter) == 'd' )
        converted = "-..";
        else if (Character.toLowerCase(letter) == 'e' )
        converted = ".";
        else if (Character.toLowerCase(letter) == 'f' )
        converted = "..-.";
        else if (Character.toLowerCase(letter) == 'g' )
        converted = "--.";
        else if (Character.toLowerCase(letter) == 'h' )
        converted = "....";
        else if (Character.toLowerCase(letter) == 'i' )
        converted = "..";
        else if (Character.toLowerCase(letter) == 'j' )
        converted = ".---";
        else if (Character.toLowerCase(letter) == 'k' )
        converted = "-.-";
        else if (Character.toLowerCase(letter) == 'l' )
        converted = ".-..";
        else if (Character.toLowerCase(letter) == 'm' )
        converted = "--";
        else if (Character.toLowerCase(letter) == 'n' )
        converted = "-.";
        else if (Character.toLowerCase(letter) == '0' )
        converted = "---";
        else if (Character.toLowerCase(letter) == 'p' )
        converted = ".--.";
        else if (Character.toLowerCase(letter) == 'q' )
        converted = "--.-";
        else if (Character.toLowerCase(letter) == 'r' )
        converted = ".-.";
        else if (Character.toLowerCase(letter) == 's' )
        converted = "...";
        else if (Character.toLowerCase(letter) == 't' )
        converted = "-";
        else if (Character.toLowerCase(letter) == 'u' )
        converted = "..-";
        else if (Character.toLowerCase(letter) == 'v' )
        converted = "...-";
        else if (Character.toLowerCase(letter) == 'w' )
        converted = ".--";
        else if (Character.toLowerCase(letter) == 'x' )
        converted = "-..-";
        else if (Character.toLowerCase(letter) == 'y' )
        converted = "-.-";
        else if (Character.toLowerCase(letter) == 'z' )
        converted = "--..";
        else if (letter == ' ')
        converted = " ";
        else if (letter == ',')
        converted = "--..--";
        else if (letter == '.')
        converted = ".-.-.-";
        else if (letter == '?')
        converted = "..--..";
        else if (letter == '0')
        converted = "-----";
        else if (letter == '1')
        converted = ".----";
        else if (letter == '2')
        converted = "..---";
        else if (letter == '3')
        converted = "...--";
        else if (letter == '4')
        converted = "....-";
        else if (letter == '5')
        converted = ".....";
        else if (letter == '6')
        converted = "-....";
        else if (letter == '7')
        converted = "--...";
        else if (letter == '8')
        converted = "---..";
        else if (letter == '9')
        converted = "----.";

        return converted;
    }
    
}
