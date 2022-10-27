import java.io.*;
import java.util.Scanner;
public class NameSearch
{
    public static void main(String[] args) throws FileNotFoundException
    {

        String[] boysArray = new String[200];
        String[] girlsArray = new String[200];
        File girlsFile = new File("GIRLNAMES.txt");
        File boysFile = new File("BOYNAMES.txt");
        Scanner boyScanner = new Scanner(boysFile);
        Scanner girlScanner = new Scanner(girlsFile);
        Scanner keyboard = new Scanner(System.in);


        for (int i = 0 ; i < 200 ; i++)
        {
            boysArray[i] = boyScanner.nextLine();
        
        }
        for (int i = 0 ; i < 200 ; i++)
        {
            girlsArray[i] = girlScanner.nextLine();
        }
        boyScanner.close();
        girlScanner.close();
        


        System.out.println("Please select the task you want to perform.");
        System.out.println("------------------------------------------");
        System.out.println("1 - Search for boys name.");
        System.out.println("2 - Search for girls name.");
        System.out.println("3 - Search for both boys and girls name.");
        System.out.print("Please enter the number of your choice here: ");
        int choice = keyboard.nextInt();
        keyboard.nextLine();
        
        
        while (choice != 1 && choice != 2 && choice != 3)
        {
            System.out.println("INVALID ENTRY. ");
            System.out.print("Please enter the number of your choice here: ");
            choice = keyboard.nextInt(); 
        }
        
        if (choice == 1)
        {
            System.out.print("Please enter the name you want to check:");
            String boyName = keyboard.nextLine();
            boolean found = false;
            int i = 0;
            while ( !found && i <200)
            {
                if (boyName.equals(boysArray[i]))
                {
                found = true;
                }
                i++;
            }
            if (found)
            System.out.print("The name is one of the names listed on the top 200.");
            else
            System.out.print("The name is not one of the names listed on the top 200.");
        }

        if (choice == 2)
        {
            System.out.print("Please enter the name you want to check:");
            String girlName = keyboard.nextLine();
            boolean found = false;
            int i = 0;
            while ( !found && i <200)
            {
                if (girlName.equals(girlsArray[i]))
                {
                found = true;
                }
                i++;

            }
            if (found)
            System.out.print("The name is one of the names listed on the top 200.");
            else
            System.out.print("The name is not one of the names listed on the top 200.");
        }

        if (choice == 3)
        {
            System.out.print("Please enter the boy name you want to check:");
            String boyName = keyboard.nextLine();
            System.out.print("Please enter the girl name you want to check:");
            String girlName = keyboard.nextLine();

            boolean foundGirl = false;
            boolean foundBoy = false;
            int i = 0;
    

            while ( !foundGirl && i <200)
            {
                if (girlName.equals(girlsArray[i]))
                {
                foundGirl = true;
                }
                i++;
            }

            i = 0;
            while ( !foundBoy && i <200)
            {
                if (boyName.equals(boysArray[i]))
                {
                foundBoy = true;
                }
                i++;
            }
        
            System.out.println();
            if (foundBoy && !foundGirl)
            {
                System.out.println("The boy's name is one of the names listed on the top 200.");
                System.out.println("The girl's name is not one of the names listed on the top 200.");
            }  
            if (!foundBoy && foundGirl)
            {
                System.out.println("The girl's name is one of the names listed on the top 200.");
                System.out.println("The boy's name is not one of the names listed on the top 200.");
            } 
            if (!foundBoy && !foundGirl)
            {
                System.out.println("Neither of the girl's or the boy's name is one of the names listed on the top 200.");
            } 
            if (foundBoy && foundGirl)
            {
                System.out.println("Both of the boy's and the girl's name is one of the names listed on the top 200.");
            }  
        }
    }
}
