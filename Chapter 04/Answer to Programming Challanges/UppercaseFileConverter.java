import java.io.*;
import java.util.Scanner;

public class UppercaseFileConverter 
{
    public static void main(String[] args)throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the name of the file you want to convert: ");
        String readFile = keyboard.nextLine();
        System.out.print("Please enter the name of the file to be converted to: ");
        String writeFile = keyboard.nextLine();
        File fileObject = new File(readFile);
        Scanner inputFile = new Scanner(fileObject);
        PrintWriter outputfile = new PrintWriter(writeFile);
        while (inputFile.hasNext())
        {
            String line = inputFile.nextLine();
            String line2 = line.toUpperCase();
            outputfile.println(line2);
        }
        outputfile.close();
        inputFile.close();
    }
    
}
