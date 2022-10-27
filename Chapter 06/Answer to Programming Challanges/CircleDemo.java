import java.util.Scanner;
public class CircleDemo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the radius of the circle: ");
        double radius = keyboard.nextDouble();
        Circle newCircle = new Circle(radius);
        System.out.printf("\nThe Circumference of the circle is: %,.2f\n", newCircle.circumference());
        System.out.printf("The Are of the circle is: %,.2f\n", newCircle.area());
        System.out.printf("The Diameter of the circle is: %,.2f\n", newCircle.diameter());
    }
    
}
