import java.util.Scanner;
public class FatGramCalculator 
{
    public static void main(String[] args)
    {
        double totalCalorie,fatGram,fatCalorie,fatPercent;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the total number of calories: ");
        totalCalorie = keyboard.nextDouble();
        System.out.print("Please enter the total gram of fat consumed: ");
        fatGram = keyboard.nextDouble();
        fatCalorie = fatGram*9;
        fatPercent = (fatCalorie/totalCalorie)*100;
        if (fatCalorie > totalCalorie)
        {
            System.out.println("Invalid Input.");
        }
        else if (fatPercent<= 30)
        {
            System.out.println("The food is low on fat.");

        }
        else 
        {
            System.out.println("The calorie from the fat is: "+fatCalorie);
            System.out.println("The calorie from the fat in percentage is: "+fatPercent);
        }

    }
    
}
