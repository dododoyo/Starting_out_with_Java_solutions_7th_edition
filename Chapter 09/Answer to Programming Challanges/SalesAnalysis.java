import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

public class SalesAnalysis 
{
	public static void main(String[] args)throws FileNotFoundException
	{
		// couldn't get the original salesfile
		int weekCounter = 0;
		double totalSales = 0;
		File salesFile = new File("SalesFile.txt");
		Scanner textScanner = new Scanner(salesFile);
		ArrayList<Double> weeklyAverages = new ArrayList<Double>();
		while(textScanner.hasNext())
		{
			double weeklyTotal = 0;
		    String line = textScanner.nextLine();
		    String[] daillySales = line.split(",");
		    
		    for (String val:daillySales)
		    {
		    	double dailySale = Double.parseDouble(val);
		    	weeklyTotal += dailySale;
		    }
		    
		    double averageDaily = weeklyTotal/7;
		    weekCounter++;
		    totalSales += weeklyTotal;
		    weeklyAverages.add(averageDaily);
		    System.out.println("\nTotal sales for week " + weekCounter + " is " + weeklyTotal);
		    System.out.println("The average daily sales for week" + weekCounter + " is " + averageDaily);
		}
		double averageWeeklySales = totalSales/weekCounter;
		double minimum = weeklyAverages.get(0);
		double maximum = weeklyAverages.get(0);
		for (int i =0; i < weekCounter;i++)
		{
			if (minimum > weeklyAverages.get(i))
			{
				minimum = weeklyAverages.get(i);
			}
			
			if (maximum < weeklyAverages.get(i))
			{
				maximum = weeklyAverages.get(i);
			}
		}
		textScanner.close();
		System.out.printf("\nTotal sales for all the weeks is %,.2f\n", totalSales);
		System.out.printf("Average sales for all the weeks is %,.2f\n", averageWeeklySales);
		System.out.printf("The minimum average daily sale of all the weeks is %,.2f\n", minimum );
		System.out.printf("The maximum average daily sale of all the weeks is %,.2f\n", maximum );
		
	
	}
}