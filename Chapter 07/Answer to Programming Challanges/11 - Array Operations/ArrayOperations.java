public class ArrayOperations 
{
    public double getTotal( double[] array)  
    {
        double theTotal = 0;
        for (int i= 0; i< array.length;i++)
        theTotal += array[i];
        return theTotal;
    }


    public double getAverage( double[] array)  
    {
        double theTotal = 0;
        for (int i= 0; i< array.length;i++)
        theTotal += array[i];
        double theAverage = (theTotal/array.length);
        return theAverage;
    }


    public double getHighest(double[] array)
    {
        double thehigh = array[0];
        for (int i=0; i<array.length ; i++)
        {
            if (array[i] > thehigh)
            thehigh = array[i];
        }
        return thehigh;
    }


    public double getLowest(double[] array)
    {
        double thelow = array[0];
        for (int i=0; i<array.length ; i++)
        {
            if (array[i] < thelow)
            thelow = array[i];
        }
        return thelow;
    }

}
