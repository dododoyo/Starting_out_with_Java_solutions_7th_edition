import java.util.Scanner;
public class StringManipulator 
{
    public static void main(String[] args)
    {
        int cityLength;
        String city;
        String upperCity;
        String lowerCity;
        char firstCity;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the name of your favourtie city: ");
        city = keyboard.nextLine();
        cityLength = city.length();
        upperCity = city.toUpperCase();
        lowerCity = city.toLowerCase();
        firstCity = city.charAt(0);
        System.out.println("The number of character's in your favourite city's name is: "+ cityLength);
        System.out.println("\t"+upperCity);
        System.out.println("\t"+lowerCity);
        System.out.println("\t"+firstCity);
    }
    
}
