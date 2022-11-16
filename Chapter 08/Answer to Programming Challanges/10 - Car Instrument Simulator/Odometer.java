public class Odometer 
{
    private int carMilage;

    public int getCarMilage()
    {
        return carMilage;
    }
    public void increaseMilage()
    {
        if (carMilage>=0 && carMilage<999999)
        carMilage++;
        else
        carMilage += 0;
    }
    public void setCarMilage(int theMilage)
    {
        carMilage = theMilage;
    }
    public int getFuel(FuelGauge inst1)
    {
        int fulage = carMilage/24;
        for (int i =0; i < fulage;i++)
        {
            inst1.decreaseFuel();
        }
        int theFuel = inst1.getFuel();
        return theFuel;
    }
}
