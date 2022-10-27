import java.util.Scanner;
public class RouletteDemo 
{
    public static void main(String[] args)
    {
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the pocket number: ");
        int Number = keyboard.nextInt();
        while (Number<0 || Number >36)
        {
            System.out.println("Entry was out of range.");
            System.out.print("Please enter the pocket number: ");
            Number = keyboard.nextInt();
        }
        RoulettePocket roulette1 = new RoulettePocket(Number);
        System.out.println("The color of the pocker is: "+ roulette1.getPocketColor());

    }
    
}
