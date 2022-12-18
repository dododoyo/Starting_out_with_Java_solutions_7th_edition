import java.util.Scanner;
public class PayrollDemo 
{
    public static void main(String[] args)throws InvalidName,InvalidHours,InvalidId,InvalidPayRate
    {
        Scanner kb = new Scanner(System.in);
        Payroll employeeData = new Payroll();
        System.out.print("Please enter the name of the employee: ");
        employeeData.setName(kb.nextLine());
        System.out.print("Please enter the Id of the employee: ");
        employeeData.setId(kb.nextLine());
        
        System.out.print("Please enter the number of hours the employee worked: ");
        int theHours = kb.nextInt();
         
        employeeData.sethours(theHours);

        System.out.print("Please enter the pay rate of the employee per hour: ");
        double payRate = kb.nextDouble();
        while (payRate < 0.0)
        {
            System.out.println("Invalid Entry");
            System.out.print("Please enter the pay rate of the employee per hour: ");
            payRate = kb.nextDouble();
        }
        employeeData.setPayRate(payRate);
        
        System.out.println("The name of the employee is :"+employeeData.getName());
        System.out.println("The Id of the employee is: " +employeeData.getID());
        System.out.println("The gross pay of the selected employee is " +employeeData.getGrossPay());
    }
}