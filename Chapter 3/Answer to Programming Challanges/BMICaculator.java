import java.util.Scanner;

public class BMICaculator 
{
    public static void main(String[] args)
    {
        double BMI, Weight;
        final double heightSquared,height;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your height: ");
        height = keyboard.nextDouble();
        System.out.print("Please enter your weight: ");
        Weight = keyboard.nextDouble();
        heightSquared = Math.pow(height,2);
        BMI = Weight*(703/heightSquared);
        if (BMI < 18.5)
        {
            System.out.println("You are underweight. ");
        }
        else if (BMI > 18.5 && BMI < 25)
        {
            System.out.println("You are underweight. ");
        }
        else 
        {
            System.out.println("You are overweight");
        }
    }
    
}
