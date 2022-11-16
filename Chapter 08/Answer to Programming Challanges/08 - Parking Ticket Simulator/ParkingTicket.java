public class ParkingTicket
{
    private String carMake;
    private  String officerName;
    private int badgeNumber;
    private String carModel;
    private String carColor;
    private String msg;
    private String licenseNumber;
    private int fine;


    public ParkingTicket(ParkedCar theCar)
    {
        PoliceOfficer theOfficer = new PoliceOfficer();
        officerName = theOfficer.getOfficerName();
        badgeNumber = theOfficer.getOfficerBadge();
        carColor = theCar.getCarColor();
        carMake = theCar.getCarMake();
        carModel = theCar.getCarModel();
        licenseNumber = theCar.getCarLicense();
        officerName = theOfficer.getOfficerName();
    }


    public void generateTicket(int minutes)
    {
        msg = "The car time has expired.";  
        if ( minutes <= 60)
        {
            fine = 25;
        }
        else
        {
            fine = (10*(minutes%60)) + 25;
        }
    } 
    public int getFine()
    {
        return fine;
    }
}
