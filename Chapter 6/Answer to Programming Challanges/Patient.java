public class Patient 
{
    String FirstName;
    String MiddleName;
    String LastName;
    String Address;
    String City;
    String State;
    int ZIPcode;
    String emergencyContactNumber;
    String emergencyContactName;

    public Patient(String firstname,String middlename,
                    String lastname, String address, String city, String state, 
                    int zipcode, String emergencyContact, String emergencyNumber)
                    {
                        FirstName = firstname;
                        MiddleName = middlename;
                        LastName = lastname;
                        Address = address;
                        City = city;
                        State = state;
                        ZIPcode = zipcode;
                        emergencyContactName = emergencyContact;
                        emergencyContactNumber = emergencyNumber;
                    }

    public void setName(String firstname, String middlename, String lastname)
    {
        FirstName = firstname;
        MiddleName = middlename;
        LastName = lastname;
    }
    public void setAddress(String address)
    {
        Address = address;
    }
    public void setCity(String city)
    {
        City = city;
    }
    public void setState(String state)
    {
        State = state;
    }
    public void setZipCode(int theZipCode)
    {
        ZIPcode = theZipCode;
    }
    public void setemergencyName(String theName)
    {
        emergencyContactName = theName;
    }
    public void setemergencyNumber(String theNumber)
    {
        emergencyContactNumber = theNumber;
    }


    public String getFirstName()
    {
        return FirstName;
    }
    public String getMiddleName()
    {
        return MiddleName;
    }
    public String getLastName()
    {
        return LastName;
    }
    public String getAddress()
    {
        return Address;
    }
    public String getState()
    {
        return State;
    }
    public String getCity()
    {
        return City;
    }
    public int getZipCode()
    {
        return ZIPcode;
    }
    public String getEmergencyName()
    {
        return emergencyContactName;
    }
    public String getEmergencyNumber()
    {
        return emergencyContactNumber;
    }
    
}
