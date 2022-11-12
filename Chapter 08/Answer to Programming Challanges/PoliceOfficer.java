public class PoliceOfficer 
{
    private  String officerName;
    private int badgeNumber;
    private int minutes;
    private int theFine;
    private String msg;

    public PoliceOfficer()
    {
        badgeNumber = 0;
        officerName = " ";
    }

    public PoliceOfficer(String name,int theBadge)
    {
        officerName = name;
        theBadge = badgeNumber;
    }

    public void issueTicket(int parkedMinutes, int purchaseMinutes)
    {
        ParkedCar theCar = new ParkedCar();

        minutes = parkedMinutes - purchaseMinutes;
        if (minutes > 0)
        {
            ParkingTicket ticket = new ParkingTicket(theCar);
            ticket.generateTicket(minutes);
            msg = "The car time has expired";
            theFine = ticket.getFine();
        }
        else
        {
            msg = "The car time has not expired yet."; 
            theFine = 0;      
        }
    }
   
    public void setOfficerName(String theName)
    {
        officerName = theName;
    }
    public String getOfficerName()
    {
        return officerName;
    }

    public void setOfficerBadge(int theBadge)
    {
        badgeNumber = theBadge;
    }
    public int getOfficerBadge()
    {
        return badgeNumber;
    }

    public int getFine()
    {
        return theFine;
    }
    public String getMessage()
    {
        return msg;
    }
}
