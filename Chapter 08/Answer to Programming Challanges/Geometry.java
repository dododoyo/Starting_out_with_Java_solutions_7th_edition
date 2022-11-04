public class Geometry 
{
    
    public static double area(double theRadius)
 {
        if (theRadius < 0)
        {
        System.out.println("Invalid value of radius was entered \nPlease restart the program.");
        return -1;
        }
        else
        {
        double radius;
        radius = theRadius;
        double area =  Math.PI*radius*radius;
        return area;
        }
    }
    public static double area (double theLength, double theWidth)
    {
        if ((theLength < 0) || (theWidth < 0))
        {
        System.out.println("Invalid value of radius was entered \nPlease restart the program.");
        return -1;
        }
        else
        {
        double length = theLength;
        double width = theWidth;
        return length*width;
        }
    }
    public static double area (double theBase,int theHeight)
    {
        if ((theBase < 0) || (theHeight < 0 ))
        {
            System.out.println("Invalid entry was detected.");
            return -1;
        }
        else
        {
        double base = theBase;
        double height = theHeight;
        return base*height*0.5;
        }
    }
    
}
