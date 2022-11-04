public class ParkedCar 
{

    private  String carMake;
    private String carModel;
    private String carColor;
    private int licenseNumber;
    private int parkedMinutes;

    public ParkedCar()
    {
        carMake = " ";
        carModel = " ";
        carColor = " ";
        licenseNumber = 0;
        parkedMinutes = 0;
    }

    public ParkedCar(ParkedCar object2)
    {
        carMake = object2.getCarMake();
        carModel = object2.getCarModel();
        carColor = object2.getCarColor();
        licenseNumber = object2.getCarLicense();
        parkedMinutes = object2.getParkedMinutes();
    }

    public void setCarMake(String theMake)
    {
        carMake = theMake;
    }
    public void setCarModel(String theModel)
    {
        carModel = theModel;
    }
    public void setCarColor(String theColor)
    {
        carColor = theColor;
    }
    public void setCarLicense(int theLicense)
    {
        licenseNumber = theLicense;
    }
    public void setParkedMinutes(int theMinutes)
    {
        parkedMinutes = theMinutes;
    }

    
    public String getCarMake()
    {
        return carMake;
    }
    public String getCarModel()
    {
        return carModel;
    }
    public String getCarColor()
    {
        return carColor;
    }
    public int getCarLicense()
    {
        return licenseNumber;
    }
    public int getParkedMinutes()
    {
        return parkedMinutes;
    }
    
}
