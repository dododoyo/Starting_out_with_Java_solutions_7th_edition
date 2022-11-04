public class AreaDemo 
{ 
    public static void main(String[] args)
    {
        final double radiusCircle = 4;
        final int Length = 10;
        final int Width = 10;
        final double height = 10;
        final double radiusCylinder = 5;
        System.out.println("This is an output of sample data entered inside the program.\n");
        System.out.printf("The area of the circle is: %,.2f\n",Area.area(radiusCircle));
        System.out.println("The area of the rectangle is: "+Area.area(Length,Width));
        System.out.printf("The area of the cylinder is: %,.2f\n",Area.area(radiusCylinder,height));

    }
    
}
