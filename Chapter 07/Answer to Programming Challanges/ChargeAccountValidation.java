public class ChargeAccountValidation 
{
    public void selectionSort(int[] array)
    {
        int startScan,index,minindex,minvalue;
        for (startScan = 0; startScan < (array.length - 1); startScan++)
        {
            minindex = startScan;
            minvalue = array[startScan];
            for (index = (startScan+1); index <(array.length);index++)
            {
                if (array[index] < minvalue)
                {
                    minindex = index;
                    minvalue = array[index];
                }
            }
            array[minindex] = array[startScan];
            array[startScan] = minvalue;
        }
    }

    
    public boolean accountFinder(int[] array,int theAccount )
    {
        int first = 0 ,last,middle,position=-1;
        boolean found = false;
        last = array.length - 1;
        while ( !found && first<=last)
        {
            middle = (last+first)/2;
            if (array[middle] == theAccount)
            {
                found = true;
                position = middle;
            }
            else if (array[middle]> theAccount)
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
