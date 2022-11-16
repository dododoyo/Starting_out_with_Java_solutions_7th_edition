import java.util.Scanner;
public class ProductionWorkerDemo 
{
    public static void main(String[] args)
    {
        ProductionWorker emp1 = new ProductionWorker();
        Scanner kb = new Scanner(System.in);
        String shiftValue = "";
        System.out.print("Please enter the Name of the Employee: ");
        emp1.setName(kb.nextLine());
        System.out.print("Please enter the EmployeeNumber of the Employee: ");
        emp1.setEmployeeNumber(kb.nextLine());
        while (Employee.isValid(emp1.getEmployeeNumber()) == false)
        {
            System.out.println("Employee number in the format 'XXX-L', where each X is a digit\n within the range 0-9 and the L is a letter within the range A-M.");
            System.out.print("Please enter the EmployeeNumber again of the Employee: ");
            emp1.setEmployeeNumber(kb.nextLine());
        }
        System.out.print("Please enter the Hire date of the Employee: ");
        emp1.setHireDate(kb.nextLine());
        System.out.print("Please enter the Shift of the Employee: ");
        emp1.setShift(kb.nextInt());
        System.out.print("Please enter the Hourly pay rate of the Employee: ");
        emp1.setRate(kb.nextDouble());

        System.out.println("\n Thank You. \n ");
        
        if (emp1.getShift() == 1)
        shiftValue = "Day";
        else if (emp1.getShift() == 2)
        shiftValue = "Night";
        System.out.println("The name of the employee is: " + emp1.getName());
        System.out.println("The employee number of the employee is: " + emp1.getEmployeeNumber());
        System.out.println("The employee was hired in : " + emp1.getHiredDate());
        System.out.println("The shift the employee is: " + shiftValue);
        System.out.println("The hourly pay rate of the employee is: " + emp1.getPayRate());
    }

    
    
}
