public class FuelGauge 
{
    private int fuelAmount;
    public FuelGauge(FuelGauge theFuel)
    {
        fuelAmount = theFuel.getFuel();
    }
    public FuelGauge()
    {
        fuelAmount = 0;
    }
    public int getFuel()
    {
        return fuelAmount;
    }
    public void setFuel(int fuelValue)
    {
        fuelAmount = fuelValue;
    }
    public void increaseFuel()
    {
        if (fuelAmount<15 && fuelAmount >=0)
        fuelAmount++;
        else
        fuelAmount = fuelAmount + 0;
    }
    public void decreaseFuel()
    {
        if (fuelAmount<=15 && fuelAmount >0)
        fuelAmount--;
        else
        fuelAmount = fuelAmount - 0;
    }
    
}
