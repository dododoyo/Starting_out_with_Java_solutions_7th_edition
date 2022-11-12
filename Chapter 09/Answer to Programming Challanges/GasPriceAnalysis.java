import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class GasPriceAnalysis 
{
    public static void main(String[] args)throws FileNotFoundException
    {
        Scanner kb = new Scanner(System.in);
        File gasPriceFile = new File("GasPrices.txt");
        String[] allLines = allData(gasPriceFile);
        double[] prices = allPrices(allLines);
        sortAndSave(prices);
        averageYearlyPriceGenerator(allLines);
        averageMonthlyPriceGenerator(allLines);
    }

    public static double[] allPrices(String[] stringAnalysied)throws FileNotFoundException
    {
        String[] prices = stringAnalysied;
        ArrayList<Double> priceList = new ArrayList<Double>();
        for (String eachLine:prices)
        {
            String[] separated = eachLine.split(":");
            double eachPrice = Double.valueOf(separated[1]);
            priceList.add(eachPrice);

        }
        
        double[] priceArray = new double[priceList.size()];
        int index = 0;
        for(Double price:priceList)
        {
            priceArray[index] = Double.valueOf(price);
            index++;
        }
        return priceArray;
    }


    public static void sortAndSave(double[] array) throws FileNotFoundException
    { 
        int startScan, index, minIndex;
        double minValue; 
        for (startScan = 0; startScan < (array.length-1);startScan++) 
        { 
            minIndex = startScan; 
            minValue = array[startScan]; 
            for(index = startScan + 1; index < array.length;index++) 
            { 
                if (array[index] < minValue) 
                { 
                    minValue = array[index]; 
                    minIndex = index; 
                } 
            } 
            array[minIndex] = array[startScan]; 
            array[startScan] = minValue; 
        }

        ArrayList<Double> array1 = new ArrayList<Double>();
        for (int k = 0 ; k < array.length ; k++)
        {
            if (searcher2(array[k],array1))
            continue;
            else
            array1.add(array[k]);
        }
        

        PrintWriter priceFile = new PrintWriter("PricesLowtoHigh.txt");
        PrintWriter priceFile2 = new PrintWriter("PricesHightoLow.txt");

        for (double val:array1)
        priceFile.println(val);
        
        for (int index2 = (array1.size() -1); index2 >-1 ;index2--)
        priceFile2.println(array1.get(index2));

        priceFile.close();
        priceFile2.close();
    } 

    public static boolean searcher(int value,ArrayList<Integer> array)
    {
        int year;
        boolean found = false;
        for (int val: array)
        {
            year = val;
            if (year == value)
            found = true;
        }
        return found;
    }

    public static boolean searcher2(double value,ArrayList<Double> array2)
    {
        double price;
        boolean found = false;
        for (double val: array2)
        {
            price = val;
            if (price == value)
            found = true;
        }
        return found;
    }


    public static void averageYearlyPriceGenerator(String[] thePrices)throws FileNotFoundException
    {
        String[] innerPrice = thePrices;

        ArrayList<Double> pricesArray = new ArrayList<Double>();
        for (String val:innerPrice)
        {
            String[] separated2 = val.split(":");
            pricesArray.add(Double.valueOf(separated2[1]));
        }
        
        ArrayList<Integer> yearsArray = new ArrayList<Integer>();
        for (String val: innerPrice)
        {
            String[] separated3 = val.split("[-:]");
            yearsArray.add(Integer.valueOf(separated3[2]));
        }

        ArrayList<Double> averagePriceList = new ArrayList<Double>();
        ArrayList<Integer> averageYearList = new ArrayList<Integer>();

        int counter = 0;
        double accumulator = 0,average=0;
        int years;


        for (int index =0;index< yearsArray.size() ;index++)
        {
            years = yearsArray.get(index);
            if (!searcher(years,averageYearList)&& index ==0)
            {
                accumulator += pricesArray.get(index);
                averageYearList.add(years);
            }
            
            else if (!searcher(years,averageYearList))
            {
                averageYearList.add(years);
                accumulator = 0;
                counter = 1;
                accumulator = pricesArray.get(index);
                averagePriceList.add(average);   
            }

            else
            {
                accumulator += pricesArray.get(index);
                counter++;
                average = accumulator/counter;             
            }   
        }
        //ArrayList<String> finalList = new ArrayList<String>();
        PrintWriter outputFile = new PrintWriter("YearlyAverage.txt");

        for (int index2 =0; index2 < averagePriceList.size();index2++)
        {
            outputFile.printf(String.valueOf(averageYearList.get(index2))+ " : %,.3f\n" , Double.valueOf(averagePriceList.get(index2)));
        
        }outputFile.close();

    }

    public static void averageMonthlyPriceGenerator(String[] allData)throws FileNotFoundException
    {
        String[] innerPrice = allData;

        ArrayList<Double> pricesArray = new ArrayList<Double>();
        for (String val:innerPrice)
        {
            String[] separated2 = val.split(":");
            pricesArray.add(Double.valueOf(separated2[1]));
        }
        
        ArrayList<Integer> monthsArray = new ArrayList<Integer>();
        for (String val: innerPrice)
        {
            String[] separated3 = val.split("[-:]");
            monthsArray.add(Integer.valueOf(String.valueOf(separated3[1])+String.valueOf(separated3[2])));
        }

        ArrayList<Double> averagePriceList = new ArrayList<Double>();
        ArrayList<Integer> averageMonthsList = new ArrayList<Integer>();

        int counter = 0;
        double accumulator = 0,average=0;
        int months;


        for (int index =0;index< monthsArray.size() ;index++)
        {
            months = monthsArray.get(index);
            if (!searcher(months,averageMonthsList)&& index ==0)
            {
                accumulator += pricesArray.get(index);
                averageMonthsList.add(months);
            }
            
            else if (!searcher(months,averageMonthsList))
            {
                averageMonthsList.add(months);
                accumulator = 0;
                counter = 1;
                accumulator = pricesArray.get(index);
                averagePriceList.add(average);   
            }

            else
            {
                accumulator += pricesArray.get(index);
                counter++;
                average = accumulator/counter;             
            }   
        }
        //ArrayList<String> finalList = new ArrayList<String>();
        PrintWriter outputFile = new PrintWriter("MonthlyAverage.txt");

        for (int index2 =0; index2 < averagePriceList.size();index2++)
        {
            outputFile.printf(String.valueOf(averageMonthsList.get(index2))+ " : %,.3f\n" , Double.valueOf(averagePriceList.get(index2)));
        
        }outputFile.close();


    }


    public static String[] allData(File theFile)throws FileNotFoundException
    {
        File innerFile = theFile;
        Scanner fs = new Scanner(innerFile);
        ArrayList<String> lines = new ArrayList<String>();
        while(fs.hasNext())
        {
            lines.add(fs.nextLine());
        }
        fs.close();
        String[] fileArray = new String[lines.size()];
        int i = 0;
        for (String val: lines)
        {
            fileArray[i] = val;
            i++;
        }

        return fileArray;
    }
}


