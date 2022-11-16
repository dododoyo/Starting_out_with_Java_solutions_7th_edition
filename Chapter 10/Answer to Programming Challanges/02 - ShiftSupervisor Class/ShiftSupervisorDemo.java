import java.util.Scanner;
public class ShiftSupervisorDemo 
{
    public static void main(String[] args)
    {
        ShiftSupervisor emp1 = new ShiftSupervisor();
        Scanner kb = new Scanner(System.in);
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
        System.out.print("Please enter the anual salary of the Employee: ");
        emp1.setSalary(kb.nextDouble());
        System.out.print("Please enter the anual production bonus of the Employee if there is: ");
        emp1.setBonus(kb.nextDouble());

        System.out.println("\n Thank You. \n ");

        System.out.println("The name of the employee is: " + emp1.getName());
        System.out.println("The employee number of the employee is: " + emp1.getEmployeeNumber());
        System.out.println("The employee was hired in : " + emp1.getHiredDate());
        System.out.println("The annual salary of the employee is: " + emp1.getSalary());
        System.out.println("The annual production bonus of the employee is: " + emp1.getBonus());
        System.out.println("The total annual salary of the employee is: " + (emp1.getBonus()+emp1.getSalary()));
    }
    
}
