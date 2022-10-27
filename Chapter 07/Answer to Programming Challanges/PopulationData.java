import java.util.Scanner;
import java.io.*;
public class PopulationData 
{
    public static void main(String[] args)throws FileNotFoundException
    {
        File populationFile = new File("USPopulation.txt");
        Scanner populations = new Scanner(populationFile);
        int[] populationArray = new int[41];
        int[] differenceArray = new int[40];

        for (int i = 0;i<41;i++)
        populationArray[i] = populations.nextInt();
        populations.close();

        for (int i=0; i<40;i++)
        {
            int theDifference = populationArray[i+1] - populationArray[i];
            differenceArray[i] = theDifference;
        }

        int total = 0;
        for (int i=0;i<40;i++)
        {
            total += differenceArray[i];
        }
        double Average = total/40;

        int theGreatest = differenceArray[0];
        int greatestIndex = 0;
        for (int i=0;i<40;i++)
        {
            if (theGreatest<differenceArray[i])
            {
            theGreatest = differenceArray[i];
            greatestIndex = i+1951;
            }
        }

        int theSmallest = differenceArray[0];
        int lowestIndex = 0;
        for (int i=0;i<40;i++)
        {
            if (theSmallest>differenceArray[i])
            {
            theSmallest = differenceArray[i];
            lowestIndex = i+1951;
            }
        }
        System.out.printf("The average annual change in population during 1950 to 1990 is: %,.2f\n",Average);
        System.out.println("\nThe year with greatest increase is the year: "+greatestIndex);
        System.out.println("With an Increase value: "+theGreatest);
        System.out.println("\nThe year with lowest increase is the year: "+lowestIndex);
        System.out.println("With an Increase value: "+theSmallest);

    }
    
}
