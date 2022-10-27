import java.util.Scanner;
import java.io.*;
public class GasPrice1994 
{
    public static void main(String[] args)throws FileNotFoundException
    {
        File weekList = new File("1994_Weekly_Gas_Averages.txt");
        Scanner week = new Scanner(weekList);
        int[] weeklyPrices = new int[52];
        for (int i = 0; i<52;i++)
        {
            weeklyPrices[i] = week.nextInt();
        }
        week.close();
        
        int theLowest = weeklyPrices[0];
        int theHighest= weeklyPrices[0];
        int lowestIndex = 0;
        int highestIndex = 0;


        for (int i=0 ; i<52 ; i++)
        {
            if (weeklyPrices[i]<theLowest)
            {
            theLowest = weeklyPrices[i];
            lowestIndex = i+1;
            }
        }


        for (int m=0 ; m<52 ; m++)
        {
            if (weeklyPrices[m]>theHighest)
            {
            theHighest = weeklyPrices[m];
            highestIndex = m+1;
            }
        }


        System.out.println("The lowest weekly averge gas price in year 1994 is: "+theLowest);
        System.out.println("This price is observed at week : " + lowestIndex);
        System.out.println("The highest weekly averge gas price in year 1994 is: "+theHighest);
        System.out.println("This price is observed at week : " + highestIndex);

        int[] monthList = {5,4,4,5, 4,4,5,4, 4,4,4,5};
        double[] monthAverage = new double[12];
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
        System.out.println();
        for (int l = 1; l<13; l++)
        {
            System.out.printf("The average gas price of month "+l+" is : %,.2f\n",monthAverage[l-1]);
        }
    }
}
