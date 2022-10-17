import java.io.*;
import java.util.Scanner;
public class FileHeadDisplay
{
    public static void main(String[] args)throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the file you want to display: ");
        String fileName = keyboard.nextLine();
        System.out.println();
        File inputFile = new File(fileName);
        Scanner fileObject = new Scanner(inputFile);
        int lines = 0;
        while ((fileObject.hasNext()&& lines<5))
        {
            String line =  fileObject.nextLine();
            System.out.println(line);
            lines++;
            
        }  
        fileObject.close(); 
    }
}
