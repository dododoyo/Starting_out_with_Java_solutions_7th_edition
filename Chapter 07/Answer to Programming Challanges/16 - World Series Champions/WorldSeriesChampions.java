import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class WorldSeriesChampions
{
    public static void main(String[] args) throws FileNotFoundException
    {
        ArrayList<String> champions = new ArrayList<>();
        File championsList = new File("WorldSeriesWinners.txt");
        Scanner listScanner = new Scanner(championsList);
        Scanner keyboard = new Scanner(System.in);

        for (int i =0; i<104 ;i++)
        champions.add(listScanner.nextLine());
        listScanner.close();
        System.out.print("Please enter the name of the club you want to check: ");
        String theClub = keyboard.nextLine();
        boolean found = false;
        int times = 0 , j=0;
        
        while(j<104)
        {
            if (champions.get(j).equals(theClub))
            times++;
            j++;
        }

        if (times >0)
        found = true;

        if(found)
        System.out.println("The entered club name won the world series championships "+times+" times.");
        else
        System.out.println("The entered club never won the world series championships");
    }

}