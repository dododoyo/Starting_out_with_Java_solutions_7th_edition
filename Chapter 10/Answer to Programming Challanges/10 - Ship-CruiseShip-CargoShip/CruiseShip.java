public class CruiseShip extends Ship
{
    private int maxPassengers;
    public CruiseShip()
    {}
    public CruiseShip(String theName, String yearBuilt, int mPassengers)
    {
        super(theName, yearBuilt);
        maxPassengers = mPassengers;
    }

    public void setMaxPassengers(int mPassengers)
    {
        maxPassengers = mPassengers;
    }
    public int getMaxPassengers()
    {
        return maxPassengers;
    }
    public String toString()
    {
        return super.toString() + "\n"+
               "The maximum number of passengers the ship could carry is " + maxPassengers;
    }
}

