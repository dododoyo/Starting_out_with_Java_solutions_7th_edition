import java.util.Scanner;
import java.io.*;
public class SortedGasPrice
{
    public static void main(String[] args)throws FileNotFoundException
    {
        File weekList = new File("1994_Weekly_Gas_Averages.txt");
        Scanner week = new Scanner(weekList);
        PrintWriter typer = new PrintWriter("MonthlyAverage.txt");
        int[] weeklyPrices = new int[52];
        String[] monthsName = {"January","February","March","April"
                                ,"May","June","July","August"
                                ,"September","October","November","December"};


        for (int i = 0; i<52;i++)
        {
            weeklyPrices[i] = week.nextInt();
        }
        week.close();
      

        int[] monthList = {5,4,4,5, 4,4,5,4, 4,4,4,5};
        double[] monthAverage = new double[12];
        double[] anothermonthAverage = new double[12];
        int k=0;
        
        for (int i = 0; i < 12;i++)
        {
            double total = 0;
            for(int j = 0 ; j < monthList[i] ; j++,k++)
            {
                total += weeklyPrices[k];
            }
            monthAverage[i] = total/monthList[i];
        }


        for (int i = 0; i < 12;i++)
        {
            anothermonthAverage[i] = monthAverage[i];
        }


        System.out.println();

       
        int startScan,index,minindex;
        double minvalue;
        String theMonth=" ";
        for (startScan = 0; startScan < (monthAverage.length - 1); startScan++)
        {
            minindex = startScan;
            minvalue = monthAverage[startScan];
            for (index = (startScan+1); index <(monthAverage.length);index++)
            {
                if (monthAverage[index] < minvalue)
                {
                    minindex = index;
                    minvalue = monthAverage[index];

                }
            }
            monthAverage[minindex] = monthAverage[startScan];
            monthAverage[startScan] = minvalue;
            
        }
        for (startScan = 0; startScan < (anothermonthAverage.length - 1); startScan++)
        {
            minindex = startScan;
            minvalue = anothermonthAverage[startScan];
            for (index = (startScan+1); index <(anothermonthAverage.length);index++)
            {
                if (anothermonthAverage[index] < minvalue)
                {
                    minindex = index;
                    theMonth = monthsName[index];
                }
            }
            monthsName[minindex] = monthsName[startScan];
            monthsName[startScan] = theMonth;
        }
        
        for (int g = 0 ; g<12 ; g++)
        {
            typer.println(monthsName[g]+" = "+monthAverage[g]);
        }
        typer.close();
    }
}
