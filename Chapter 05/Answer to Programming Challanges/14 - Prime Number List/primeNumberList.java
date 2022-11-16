import java.io.*;
public class primeNumberList 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        
        PrintWriter outputfile = new PrintWriter("primenumberlist.txt");
        for (int i = 1; i <= 100; i++)
        {
            if (isPrime(i)==true)
            outputfile.println(i);
        }
        outputfile.close();

    }
    public static boolean isPrime(int theNumber)
    {
        int theChecking = 0;
        for (int i = theNumber; i >=1; i--)
        {
            if (theNumber%i == 0)
            theChecking++;
        }
        if (theChecking==2)
        return true;
        else
        return false;
    } 
    
}
