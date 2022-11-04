public class LandTract 
{
    private double length;
    private double width;
    private double area;

    public LandTract(double theLength, double theWidth)
    {
        length = theLength;
        width = theWidth;
    }

    public double getArea()
    {
        area = length*width;
        return area;
    }

    public boolean equals(LandTract object2)
    {
        if (getArea() == object2.getArea())
        return true;
        else 
        return false;
    }

    public String toString()
    {
        String str = "The length of the tract is: "+length
                    +"The width of the tract is: "+ width
                    + "The area if the tract is: "+area;
        return str;
    }   
}
