import java.util.Random;
import java.io.*;
import java.util.Scanner;
public class evenOddCounter 
{
    public static void main(String[] args)throws FileNotFoundException
    {
        int randomNum;
        PrintWriter evens = new PrintWriter("evenNumbers.txt");
        PrintWriter odds = new PrintWriter("oddNumbers.txt");
        Random rand = new Random();
        for (int i= 1; i <=100 ;i++)
        {
            randomNum = rand.nextInt(1000);
            if (isEven(randomNum) == true)
            evens.println(randomNum);
            else
            odds.println(randomNum);
        }
        evens.close();
        odds.close();
        listShower();
        
    }
    public static void listShower()throws FileNotFoundException
    {
        File oddfile = new File("oddNumbers.txt");
        File evenfile = new File("evenNumbers.txt");
        Scanner oddnumber = new Scanner(oddfile);
        Scanner evennumber = new Scanner(evenfile);
        
        System.out.println("\n\nThis is the list of odd numbers.");
        while (oddnumber.hasNext())
        System.out.println(oddnumber.nextLine());

        System.out.println("\n\nThis is a list of even numbers");
        while (evennumber.hasNext())
        System.out.println(evennumber.nextLine());
        evennumber.close();
        oddnumber.close();
    }


    public static boolean isEven(int theNumber)
    {
        if ((theNumber % 2) == 0)
        return true;
        else;
        return false;
    }
    
}
