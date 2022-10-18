import java.util.Scanner;
import java.io.*;
public class FileLetterCounter 
{
    public static void main(String[] args)throws FileNotFoundException
    {
        String fileName;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the file you want to open: ");
        fileName = keyboard.nextLine();
        File fileObject = new File(fileName);
        Scanner InputFile = new Scanner(fileObject);

        int counter=0;
        String letter2,letter;
        char ch;

        System.out.print("Please enter the letter you are looking for: ");
        letter2 = keyboard.nextLine();
        ch = letter2.charAt(0);
        while (InputFile.hasNext())
        {
            int index=0;
            letter = InputFile.nextLine();
            int length = letter.length();
            while (index<length)
            {
                if ((letter.charAt(index))==ch)
                {
                length = letter.length();
                counter++; 
                }
                index++;
            }
        }
        keyboard.close();
        System.out.println("The letter '"+ch+"' apear "+counter+" times in the file");
    }
}
