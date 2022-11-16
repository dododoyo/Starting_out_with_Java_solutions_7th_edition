import java.util.Scanner;
public class TeamleaderDemo 
{
    public static void main(String[] args)
    {
        TeamLeader emp1 = new TeamLeader();
        Scanner kb = new Scanner(System.in);
        String shiftValue = "";
        System.out.print("Please enter the Name of the TeamLeader: ");
        emp1.setName(kb.nextLine());
        System.out.print("Please enter the TeamLeaderNumber of the TeamLeader: ");
        emp1.setEmployeeNumber(kb.nextLine());
        while (TeamLeader.isValid(emp1.getEmployeeNumber()) == false)
        {
            System.out.println("TeamLeader number in the format 'XXX-L', where each X is a digit\n within the range 0-9 and the L is a letter within the range A-M.");
            System.out.print("Please enter the TeamLeaderNumber again of the TeamLeader: ");
            emp1.setEmployeeNumber(kb.nextLine());
        }
        System.out.print("Please enter the Hire date of the TeamLeader: ");
        emp1.setHireDate(kb.nextLine());
        System.out.print("Please enter the Shift of the TeamLeader: ");
        emp1.setShift(kb.nextInt());
        System.out.print("Please enter the Hourly pay rate of the TeamLeader: ");
        emp1.setRate(kb.nextDouble());
        System.out.println("Please enter the required number of training hours for the supervisor");
        emp1.setRequiredHours(kb.nextInt());
        System.out.println("Please enter the number of training hours attended by the supervisor");
        emp1.setAttendedHours(kb.nextInt());
        System.out.println("Please enter the amount of monthly bonus to be recieved by the supervisor");
        emp1.setMonthlyBonus(kb.nextDouble());

        System.out.println("\n Thank You. \n");

        if (emp1.getShift() == 1)
        shiftValue = "Day";
        else if (emp1.getShift() == 2)
        shiftValue = "Night";
        System.out.println("The name of the TeamLeader is: " + emp1.getName());
        System.out.println("The Empoloyee number of the TeamLeader is: " + emp1.getEmployeeNumber());
        System.out.println("The TeamLeader was hired in : " + emp1.getHiredDate());
        System.out.println("The shift the TeamLeader is: " + shiftValue);
        System.out.println("The hourly pay rate of the TeamLeader is: " + emp1.getPayRate());
        System.out.println("The Monthly bonus of the TeamLeader is: " + emp1.getMonthlyBonus());
        System.out.println("The required number of hours of training to be attended by the TeamLeader is: " + emp1.getRequiredHours());
        System.out.println("The required number of hours attended by the TeamLeader is: " + emp1.getAttendedHours());
    }
    
}
