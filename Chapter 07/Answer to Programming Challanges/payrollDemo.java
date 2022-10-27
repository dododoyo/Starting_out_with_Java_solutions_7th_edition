import java.util.Scanner;
public class payrollDemo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Payroll employeeData = new Payroll();
        System.out.println("This is the list of employees who work here: ");
        for (int i = 0 ; i < 7; i++)
        {
            System.out.println("Employee "+ (i+1)+ "  ID = "+ employeeData.getID(i));
        }
        System.out.print("Please choose one employee by it's number: ");
        int choice = keyboard.nextInt();
        while (choice < 0 || choice > 7)
        {
            System.out.print("Invalid Entry");
            System.out.print("Please choose one employee by it's number: ");
            choice = keyboard.nextInt();
        }
        System.out.println("\nThe desired employee is now selected.");
        System.out.print("Please enter the number of hours the employee worked:");
        int theHours = keyboard.nextInt();
        while (theHours < 0)
        {
            System.out.println("Invalid Entry");
            System.out.print("Please enter the number of hours the employee worked:");
            theHours = keyboard.nextInt();
            
        }
        System.out.print("Please enter the pay rate of the employee per hour: ");
        double payRate = keyboard.nextDouble();

        while (payRate < 6.0)
        {
            System.out.println("Invalid Entry");
            System.out.print("Please enter the pay rate of the employee per hour: ");
            payRate = keyboard.nextDouble();
        }
        employeeData.setPayRate((choice - 1), payRate);
        employeeData.sethours((choice - 1), theHours);
        employeeData.calculateWages();
        System.out.println("\nThe wage of the selected employee "+ employeeData.getID(choice-1) +" is: " + employeeData.getWages(choice-1));
        

    }
    
}
