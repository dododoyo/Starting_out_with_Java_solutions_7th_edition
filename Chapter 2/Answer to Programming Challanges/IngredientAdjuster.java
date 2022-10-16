import java.util.Scanner;
public class IngredientAdjuster 
{
    public static void main(String[] args)
    {
        double sugarRate = 32.0;
        double butterRate = 48;
        double flourRate = 17.455;
        double sugar;
        double butter;
        double flour;
        double cookiesNeeded;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of cookies you would like to have: ");
        cookiesNeeded = keyboard.nextInt();
        sugar = cookiesNeeded/sugarRate;
        butter = cookiesNeeded/butterRate;
        flour = cookiesNeeded/flourRate;
        System.out.println("The amount of cups of sugar needed is: "+ sugar);
        System.out.println("The amount of cups of flour needed is: "+ flour);
        System.out.println("The amount of cups of butter needed is: "+ butter);
    }
    
}
