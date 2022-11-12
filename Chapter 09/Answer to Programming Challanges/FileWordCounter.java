import java.util.Scanner;
import java.io.*;
public class FileWordCounter 
{
    public static void main(String[] args)throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the name of the file: ");
        String theName = keyboard.nextLine();
        File theFile = new File(theName);
        Scanner textFile = new Scanner(theFile);
        int counter2 =0 ;
        while (textFile.hasNext())
        {
            String theLine = textFile.nextLine();
            theLine.trim();
            counter2 += wordCounter(theLine);
        }
        System.out.println("The file has "+counter2+" words.");
        textFile.close();
    }


    public static int wordCounter(String string)
    {
        int counter = 0;
        String theString = string;
        String[] wordArray = theString.split("[ .!?]");
        
        for (int i = 0 ; i < wordArray.length; i++)
        {
            wordArray[i] = wordArray[i].trim();
            if (!wordArray[i].isEmpty())
            {
                counter++;
            }
        }
        return counter;
        
    } 
}
