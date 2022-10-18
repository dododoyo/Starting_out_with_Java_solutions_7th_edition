import java.util.Scanner;
public class rectangleArea 
{
    public static void main(String[] args)
    {
        double length = getLength();
        double width = getWidth();
        double area = getArea(length,width);
        displayData(area);

    }
    public static double getLength()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the length of the rectangle: ");
        double theLength = keyboard.nextDouble();
        return theLength;

    }
    public static double getWidth()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the width of the rectangle: ");
        double theWidth = keyboard.nextDouble();
        return theWidth;

    }
    public static double getArea(double theLength,double theWidth)
    {
        double theArea = theLength*theWidth;
        return theArea;

    }
    public static void displayData(double theArea)
    {
        System.out.println("The area of the rectangle is: " +theArea);

    }

}
