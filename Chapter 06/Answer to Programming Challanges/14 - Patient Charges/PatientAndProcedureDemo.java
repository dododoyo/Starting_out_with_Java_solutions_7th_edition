public class PatientAndProcedureDemo 
{
    public static void main(String[] args){
    Patient patient1 = new Patient("Bill ", "Rich", "Gates", "America", "Los Angels", "Washington", 2134, "Warren Buffet", "80329843");
    Procedure procedure1 = new Procedure("Physical Exam", "October 21" ,"Dr. Irvine", 250) ;
    Procedure procedure2 = new Procedure("X-ray", "October 21", "Dr. Jamison", 500);
    Procedure procedure3 = new Procedure("Blood Test","October 21","Dr. Smith",200);
    double totalCharges = procedure1.getprocedureCharges()+procedure2.getprocedureCharges()+procedure3.getprocedureCharges();
    System.out.println("\nThe name of the patient is: "+ patient1.getFirstName() +" "+patient1.getLastName());
    System.out.println("The patient lives in the city of: "+patient1.getCity());
    System.out.println("The patient's address is: "+ patient1.getAddress());
    System.out.println("The patient lives in the state of: "+ patient1.getState());
    System.out.println("The patient's ZIP code is: "+ patient1.getZipCode());
    System.out.println("The patient's Emergency contact is: "+ patient1.getEmergencyName());
    System.out.println("The patient's Emergency contact phone number is: "+ patient1.getEmergencyNumber());

    System.out.println("\nThe procedure name of procedure 1 is: "+procedure1.getProcedureName());
    System.out.println("The procedure date of procedure 1 is: "+procedure1.getProcedureDate());
    System.out.println("The procedure practitioner of procedure 1 is: "+procedure1.getProcedurePractitioner());
    System.out.println("The procedure charge of procedure 1 is: "+procedure1.getprocedureCharges());

    System.out.println("\nThe procedure name of procedure 2 is: "+procedure2.getProcedureName());
    System.out.println("The procedure date of procedure 2 is: "+procedure2.getProcedureDate());
    System.out.println("The procedure practitioner of procedure 2 is: "+procedure2.getProcedurePractitioner());
    System.out.println("The procedure charge of procedure 2 is: "+procedure2.getprocedureCharges());

    System.out.println("\nThe procedure name of procedure 3 is: "+procedure3.getProcedureName());
    System.out.println("The procedure date of procedure 3 is: "+procedure3.getProcedureDate());
    System.out.println("The procedure practitioner of procedure 3 is: "+procedure3.getProcedurePractitioner());
    System.out.println("The procedure charge of procedure 3 is: "+procedure3.getprocedureCharges());

    System.out.println("\nThe total charges of the procedure is: "+totalCharges);

    
    }
}
