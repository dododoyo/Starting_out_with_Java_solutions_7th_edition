//NOT FINISHED
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class LotteryStat 
{
    public static void main(String[] args)throws FileNotFoundException
    {
        File fileName = new File("pbnumbers.txt");
        Scanner fileScan = new Scanner(fileName);
        String[] numList = new String[69];
        int[] numRepList = new int [69];
        numList[0] = "01";
        numList[1] = "02";
        numList[2] = "03";
        numList[3] = "04";
        numList[4] = "05";
        numList[5] = "06";
        numList[6] = "07";
        numList[7] = "08";
        numList[8] = "09";
        for (int i = 9 ; i < 69; i++)
        {
            numList[i] = String.valueOf(i+1);
        }

        ArrayList<String> lines = new ArrayList<String>();

        while (fileScan.hasNext())
        {  
            lines.add(fileScan.nextLine());
        }

        int length = lines.size();
        String[] theLine = new String[length];
        int[] powerBalls = new int[length];

        for (int i = 0; i < length;i++)
        theLine[i]  = lines.get(i);

        for (int i = 0; i < length ; i++)
        {
            String[] eachValue = theLine[i].split(" ");
            powerBalls[i] = Integer.valueOf(eachValue[5]);
        }

        ArrayList<Integer> valueList = new ArrayList<>();
        ArrayList<Integer> repList = new ArrayList<>();
        
        for(int i =0; i< powerBalls.length;i++)
        {
            int counter = 1;
            for (int j = i+1; j<powerBalls.length;j++)
            {
                if (counter==1 && powerBalls[i] == powerBalls[j])
                {
                    valueList.add(powerBalls[i]);
                    repList.add(counter);
                    counter++;
                }
                else if (counter !=1 && powerBalls[i] == powerBalls[j])
                {
                    counter++;
                    repList.set(i,counter);
                }
            }

            for (int r =0; r< valueList.size();r++)
            {
                System.out.println(valueList.get(r));
                System.out.println(repList.get(r));
            }
        }
        

        int startScan, index, minIndex, minValue1;
        String minValue2; 
        for (startScan = 0; startScan < (numRepList.length-1); startScan++) 
        { 
        minIndex = startScan; 
        minValue1 = numRepList[startScan]; 
        minValue2 = numList[startScan]; 
            for(index = startScan + 1; index < numRepList.length; index++) 
            { 
                if (numRepList[index] < minValue1) 
                { 
                    minValue1 = numRepList[index]; 
                    minValue2 = numList[index]; 
                    minIndex = index; 
                } 
            } 
            numRepList[minIndex] = numRepList[startScan]; 
            numRepList[startScan] = minValue1; 
            numList[minIndex] = numList[startScan];
            numList[startScan] = minValue2;
        } 

        
        System.out.println("Most common Numbers");
        System.out.println("-----------------");
        System.out.println("Numbers       Times");
        System.out.println("-------       -----");
        for(int k = 68 ; k > 58 ; k--)
        System.out.println(numList[k] + "     --->    "+ numRepList[k]);

        System.out.println("Least common Numbers");
        System.out.println("-----------------");
        System.out.println("Numbers       Times");
        System.out.println("-------       -----");

    }   
}
