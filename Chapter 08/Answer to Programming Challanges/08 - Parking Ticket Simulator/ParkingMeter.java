public class ParkingMeter 
{
    private int purchasedminutes;
    public ParkingMeter(int theMinutes)
    {
        purchasedminutes = theMinutes;
    } 
    public ParkingMeter()
    {
        purchasedminutes = 0;
    } 
    public int getPurchasedMinutes()
    {
        return purchasedminutes;
    }  
    public void setPurchasedMinutes(int theMinutes)
    {
        purchasedminutes = theMinutes;
    }
}
