import java.io.*;
import java.util.Scanner;
public class LineNumbers
{
    public static void main(String[] args)throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the file you want to display: ");
        String fileName = keyboard.nextLine();
        System.out.println();
        File inputFile = new File(fileName);
        Scanner fileObject = new Scanner(inputFile);
        int lines = 1;
        while (fileObject.hasNext())
        {
            String line =  fileObject.nextLine();
            System.out.println(line+": "+lines);
            lines++;
            
        }  
        fileObject.close(); 
    }
}
