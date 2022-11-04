import java.util.Scanner;
public class LandTractDemo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the length of the Tract field 1: ");   
        double length1 = keyboard.nextDouble();
        System.out.print("Please enter the width of the Tract field 1: ");   
        double width1 = keyboard.nextDouble();
        System.out.println();   
        System.out.print("Please enter the length of the Tract field 2: ");   
        double length2 = keyboard.nextDouble();
        System.out.print("Please enter the width of the Tract field 2: ");   
        double width2 = keyboard.nextDouble();

        LandTract Land1 = new LandTract(length1, width1);
        LandTract Land2 = new LandTract(length2, width2);

        System.out.println("\nThe area of the first land is: "+Land1.getArea());
        System.out.println("The area of the second land is: "+Land2.getArea());
        if (Land1.equals(Land2))
        System.out.println("The two lands are equal by size.");
        else
        System.out.println("The two lands are not equal by size.");
    }
}
