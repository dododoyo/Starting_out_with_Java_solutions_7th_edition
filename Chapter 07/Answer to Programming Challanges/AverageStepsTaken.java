import java.io.*;
import java.util.Scanner;
public class AverageStepsTaken 
{
    public static void main(String[] args)throws FileNotFoundException
    {
        File theSteps = new File("steps.txt");
        Scanner steps = new Scanner(theSteps);
        double[] averages = new double[12];
        String[] monthsName = {"January","February","March","April"
                                ,"May","June","July","August"
                                ,"September","October","November","December"};
        int k = 0;
        for (int i = 1;i <13;i++)
        {
            if (i==1 || i==3 || i==5 || i==7 || i==8 || i==10 || i==12){
                double total = 0;
                for(int j=1; j<32 ; j++)
                {
                    int dayValue = steps.nextInt();
                    total += dayValue;

                }
                double averageMonlthly = total/31;
                averages[k] = averageMonlthly;
    

            }


            if (i==4 || i==6 || i==9 || i==11 ){
                double total = 0;
                for(int j=1; j<31 ; j++)
                {
                    int dayValue = steps.nextInt();
                    total += dayValue;

                }
                double averageMonlthly = total/31;
                averages[k] = averageMonlthly;
            }


            if (i==2 ){
                double total = 0;
                for(int j=1; j<29 ; j++)
                {
                    int dayValue = steps.nextInt();
                    total += dayValue;

                }
                double averageMonlthly = total/31;
                averages[k] = averageMonlthly;
            }
            k++;
        }
        steps.close();
        for (int l=1; l<13;l++)
        {
            System.out.printf("The average steps for "+monthsName[l-1]+" is : %,.2f\n",averages[l-1]);
        }
    }  
}
