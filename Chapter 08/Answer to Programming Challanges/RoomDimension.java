public class RoomDimension 
{
    private double length;
    private double width;

    public RoomDimension(double theLength, double theWidth)
    {
        length = theLength;
        width = theWidth;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public RoomDimension(RoomDimension theDimension)
    {
        length = theDimension.getLength();
        width = theDimension.getWidth();
    }

    public double getArea()
    {
        return length*width;
    }
    
}
