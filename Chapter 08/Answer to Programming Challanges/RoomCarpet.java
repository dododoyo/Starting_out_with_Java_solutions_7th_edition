public class RoomCarpet 
{
    private RoomDimension size;
    private double cost;
    private double totalCost;
    public RoomCarpet(RoomDimension theDimensions, double costPerArea)
    {
        size = new RoomDimension(theDimensions);
        cost = costPerArea;
    }

    public double getTotalCost()
    {
        totalCost = size.getArea()*cost;
        return totalCost;
    }

    public String toString()
    {
        String str = "Area of the room is: "+ size.getArea()
                    +"\nCost of carpeting the room per area is: "+ cost
                    +"\nThe total price of carpeting the area is:  "+ getTotalCost();
        return str;
    }

    
}
