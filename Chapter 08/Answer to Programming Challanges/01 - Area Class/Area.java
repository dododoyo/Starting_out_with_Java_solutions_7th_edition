public class Area 
{
    public static double area(double theRadius)
    {
        final double PI = Math.PI;
        double area = PI*theRadius*theRadius; 
        return area;
    }

    public static int area(int theLength, int theWidth)
    {
        int area = theLength*theWidth; 
        return area;
    }

    public static double area(double theRadius, double theHeight)
    {
        final double PI = Math.PI;
        double area = PI*theRadius*theRadius*theHeight; 
        return area;
    }
}