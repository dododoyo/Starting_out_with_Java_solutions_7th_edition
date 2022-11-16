import java.util.Scanner;
public class TelephoneTralnslator 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the phone number in the Alphabetic form.");
        System.out.println("The number must be in the following format 'XXX-XXX-XXX'.");
        System.out.print("Phone Number >> ");
        String thePhone = keyboard.nextLine();
        String[] phoneArray = thePhone.split("-");
        String[] translated = new String[12];
        int k = 0;
        for (int i = 0; i < phoneArray.length;i++)
        {
            char[] charArray = phoneArray[i].toCharArray();
            for (int j = 0 ; j < charArray.length ; j++)
            {
                if (Character.isDigit(charArray[j]))
                {
                    translated[k] = String.valueOf(Character.getNumericValue(charArray[j]));
                    k++;
                }
                else if (Character.isLetter(charArray[j]))
                {
                    char smallChar = Character.toLowerCase(charArray[j]); 
                    int theNum =0 ;
                    if (     smallChar == 'a' || smallChar == 'b'  || smallChar == 'c')
                    theNum = 2;
                    else if (smallChar == 'd' || smallChar == 'e'  || smallChar == 'f')
                    theNum = 3;
                    else if (smallChar == 'g' || smallChar == 'h'  || smallChar == 'i')
                    theNum = 4;
                    else if (smallChar == 'j' || smallChar == 'k'  || smallChar == 'l')
                    theNum = 5;
                    else if (smallChar == 'm' || smallChar == 'n'  || smallChar == 'o')
                    theNum = 6;
                    else if (smallChar == 'p' || smallChar == 'q'  || smallChar == 'r' || smallChar == 's')
                    theNum = 7;
                    else if (smallChar == 't' || smallChar == 'u'  || smallChar == 'v')
                    theNum = 8;
                    else if (smallChar == 'w' || smallChar == 'x'  || smallChar == 'y' || smallChar == 'z')
                    theNum = 9;
                    translated[k] = String.valueOf(theNum);
                    k++;
                }
                
            }
            if (i <2)
            {
                translated[k] = "-";
                k++;
            }        
        }
        for (String val: translated)
        System.out.print(val);
    }  
}
