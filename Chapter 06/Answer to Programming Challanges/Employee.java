public class Employee 
{
    String name1 ;
    int idNumber1  ;
    String department1  ;
    String position1;
    public Employee(String name, int idNumber, String department, String position)
    { 
        name1 = name;
        idNumber1 = idNumber;
        department1 = department;
        position1 = position;

    }
    public Employee(String name, int idNumber)
    { 
        name1 = name;
        idNumber1 = idNumber;
        department1 = "";
        position1 = "";

    }
    public Employee()
    { 
        name1 = "";
        idNumber1 = 0;
        department1 = "";
        position1 = "";

    }
    public void setName(String theName){
        name1 = theName;
    }

    public void setidNumber(int theidNumber){
        idNumber1 = theidNumber;
    }

    public void setDepartment(String theDepartment){
        department1 = theDepartment;
    }

    public void setPosition(String theposition){
        position1 = theposition;
    }
    public String getName(){
        return name1;
    }
    public String getDepartment(){
        return department1;
    }
    public String getPosition(){
        return position1;
    }
    public int  getidNumber(){
        return idNumber1;
    }
    
    
}
