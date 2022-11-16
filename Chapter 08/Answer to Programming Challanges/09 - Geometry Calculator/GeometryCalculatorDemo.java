import java.util.Scanner;
public class GeometryCalculatorDemo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double area;
        System.out.println("       Geometry Calculator.");
        System.out.println("1. Calculate the Area of a Circle.");
        System.out.println("2. Calculate the Area of a Rectangle.");
        System.out.println("3. Calculate the Area of a Triangle.");
        System.out.println("4. Quit.\n");
        System.out.print("Enter your choice (1-4): ");
        int choice = keyboard.nextInt();
        while (choice!=1 && choice !=2 && choice != 3 && choice != 4)
        {
            System.out.print("Invalid Entry.");
            System.out.print("Enter your choice (1-4): ");
            choice = keyboard.nextInt();   
        }
        if (choice == 1)
        {
            System.out.print("Please enter the radius of the circle: ");
            double radius = keyboard.nextInt();
            area = Geometry.area(radius);
            System.out.printf("The area of the circle is: %,.2f", area);
        }
        else if (choice == 2)
        {
            System.out.print("Please enter the length of the rectangle: ");
            double length = keyboard.nextDouble();
            System.out.print("Please enter the width of the rectangle: ");
            double width = keyboard.nextDouble();
            area = Geometry.area(length,width);
            System.out.printf("The area of the rectangle is: %,.2f", area);
        }
        else if (choice == 3)
        {
            System.out.print("Please enter the base of the triangle: ");
            double base = keyboard.nextDouble();
            System.out.print("Please enter the height of the triangle: ");
            int height = keyboard.nextInt();
            area = Geometry.area(base ,height);
            System.out.printf("The area of the triangle is: %,.2f", area);
        }
        else 
        System.exit(0);

    }
    
}
