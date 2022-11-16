public class CargoShip extends Ship
{
    private int maxCapacity;
    public CargoShip()
    {}
    public CargoShip(String theName, String yearBuilt, int mCapacity)
    {
        super(theName, yearBuilt);
        maxCapacity = mCapacity;
    }

    public void setMaxCapacity(int mCapacity)
    {
        maxCapacity = mCapacity;
    }
    public int getMaxCapacity()
    {
        return maxCapacity;
    }
    public String toString()
    {
        return super.toString() + "\n"+
               "The maximum capacity of the ship could carry in tons is " + maxCapacity;
    }
}

