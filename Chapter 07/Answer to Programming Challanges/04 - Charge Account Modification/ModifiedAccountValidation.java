import java.io.*;
import java.util.Scanner;
public class ModifiedAccountValidation
{
    public boolean accountFinder(int theAccount ) throws FileNotFoundException
    {
        File accountList = new File("AccountList.txt");
        Scanner theList = new Scanner(accountList);
        int[] accountArray = new int[18];

        for (int i = 0; i < 18; i++)
        {
            accountArray[i] = theList.nextInt();
        }


        int startScan,index,minindex,minvalue ;
        for (startScan = 0; startScan < (accountArray.length - 1); startScan++)
        {
            minindex = startScan;
            minvalue = accountArray[startScan];
            for (index = (startScan+1); index <accountArray.length;index++)
            {
                if (accountArray[index] < minvalue)
                {
                    minindex = index;
                    minvalue = accountArray[index];
                }
            }
            accountArray[minindex] = accountArray[startScan];
            accountArray[startScan] = minvalue;
        }
        
        int first = 0 ,last,middle,position=-1;
        boolean found = false;
        last = accountArray.length - 1;
        while ( !found && first<=last)
        {
            middle = (last+first)/2;
            if (accountArray[middle] == theAccount)
            {
                found = true;
                position = middle;
            }
            else if (accountArray[middle]> theAccount)
            {
                last = middle - 1;
            }
            else 
            first = middle + 1;
        }
        if (position != -1)
        return true;
        else 
        return false;
    }
}