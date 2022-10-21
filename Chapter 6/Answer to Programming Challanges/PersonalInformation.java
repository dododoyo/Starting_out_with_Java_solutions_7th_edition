public class PersonalInformation 
{
    String name;
    String address;
    int age;
    int phoneNumber;

    public PersonalInformation(String theName, String theAddress, int theAge, int thePhoneNumber)
    {
        name = theName;
        address = theAddress;
        age = theAge;
        phoneNumber = thePhoneNumber;
    }
    public PersonalInformation()
    {
        name = "";
        address = "";
        age = 0;
        phoneNumber = 0;
    }    

    public void setName(String theName){
        name = theName;

    }
    public void setAddress(String theAddress){
        address = theAddress;
    }
    public void setAge(int theAge){
        age = theAge;
    }
    public void setPhone(int thePhone){
        phoneNumber = thePhone;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
    public int getPhone(){
        return phoneNumber;
    }
}
