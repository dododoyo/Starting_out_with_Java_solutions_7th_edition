import java.util.Scanner;
public class CookieCalories 
{
    public static void main(String[] args)
    {
        int cookies;
        final int caloriepercookie = 75;
        int totalCalorie ;
        Scanner keyboard =  new Scanner(System.in);
        System.out.print("Please enter the number of cookies eaten: ");
        cookies = keyboard.nextInt();
        totalCalorie = cookies*caloriepercookie;
        System.out.println("The total calorie from "+cookies+" cookies is "+totalCalorie+" calories.");
    }
    
}
