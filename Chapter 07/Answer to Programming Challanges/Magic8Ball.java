import java.util.Scanner;
import java.util.Random;
import java.io.*;
public class Magic8Ball 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        File toRead = new  File("8_ball_responses.txt");
        Scanner lines = new Scanner(toRead);
        String[] theLines = new String[12];
        for (int i = 0; i < 12 ; i++)
        {
            theLines[i] = lines.nextLine();

        } 
        int theNUmber = rand.nextInt(13);
        System.out.print("Please enter your most important question here: ");
        String theQuestion = keyboard.nextLine();
        System.out.println(theLines[theNUmber]);
        lines.close();
    }
    
}
