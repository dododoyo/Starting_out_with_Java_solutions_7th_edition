import java.util.Scanner;
public class RestaurantSelector 
{
    public static void main(String[] args)
    {
        String response1,response2,response3;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please reply 'yes' or 'no'.");
        System.out.print("Is anyone in your party a vegetarian? ");
        response1 = keyboard.nextLine();
        System.out.print("Is anyone in your party a vegan? ");
        response2 = keyboard.nextLine();
        System.out.print("Is anyone in your party a gluten-free? ");
        response3 = keyboard.nextLine();
        
        if (response1.equals("yes") && response2.equals("yes")  && response3.equals("yes"))
        {System.out.println("Here are your restaurant choices:\n");
        System.out.println("The Chef's Kitchen.");
        System.out.println("Corner Cafe");}

        if (response1.equals("no") && response2.equals("yes") &&response3.equals("yes"))
        {System.out.println("Here are your restaurant choices:\n");
        System.out.println("The Chef's Kitchen.");
        System.out.println("Corner Cafe");}

        if (response1.equals("yes") && response2.equals("no")&&response3.equals("yes"))
        {System.out.println("Here are your restaurant choices:\n");
        System.out.println("The Chef's Kitchen.");
        System.out.println("Corner Cafe");
        System.out.println("Main Street Pizza Company");}

        if (response1.equals("no") && response2.equals("no")&&response3.equals("yes"))
        {System.out.println("Here are your restaurant choices:\n");
        System.out.println("The Chef's Kitchen.");
        System.out.println("Corner Cafe");
        System.out.println("Main Street Pizza Company");}

        if (response1.equals("yes") && response2.equals("no")&&response3.equals("no"))
        {System.out.println("Here are your restaurant choices:\n");
        System.out.println("The Chef's Kitchen.");
        System.out.println("Corner Cafe");
        System.out.println("Main Street Pizza Company");
        System.out.println("Mama's Fine Italian");}

        if (response1.equals("no") && response2.equals("yes")&&response3.equals("no"))
        {System.out.println("Here are your restaurant choices:\n");
        System.out.println("The Chef's Kitchen.");
        System.out.println("Corner Cafe");}

        if (response1.equals("no") && response2.equals("no")&&response3.equals("no"))
        {
            System.out.println("Here are your restaurant choices:\n");
            System.out.println("Joe's Gourmet Burgers\n");

        }
    }
    
}
