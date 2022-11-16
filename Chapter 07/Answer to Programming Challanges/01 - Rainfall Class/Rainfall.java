public class Rainfall 
{
    public double totalRainfall(double[] array)
    {
        double total = 0;   
        for (int index =0 ;index<12;index++)
        {
            total += array[index];
        }
        return total;
    }
    

    public double averageRainfall(double[] array)
    {
        double total = 0;
        for (int index =0 ;index<12;index++)
        {
            total += array[index];
        }
        double average = total/12;
        return average;

    }

    public double maxRainfall(double[] array)
    {
        double max = array[0];
        for (int index =0 ;index<12;index++)
        {
            if (array[index] > max)
            max = array[index];
        }
        return max;

    }

    public double minRainfall(double[] array)
    {
        double min = array[0];
        for (int index =0 ;index<12;index++)
        {
            if (array[index] < min)
            min = array[index];
        }
        return min;

    }


}
