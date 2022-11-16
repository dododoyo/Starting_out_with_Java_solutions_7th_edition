public class EmployeeDemo{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee employee3 = new Employee("Joy Rogers",81774,"Manufacturing","Enginner");
        System.out.println("Here is a list of employees.");

        System.out.println("\nEmployee 1");
        System.out.println("Name = "+ employee1.getName());
        System.out.println("ID Number = "+ employee1.getidNumber());
        System.out.println("Position = "+ employee1.getPosition());
        System.out.println("Department = "+ employee1.getDepartment());

        System.out.println("\nEmployee 2");
        System.out.println("Name = "+ employee2.getName());
        System.out.println("ID Number = "+ employee2.getidNumber());
        System.out.println("Position = "+ employee2.getPosition());
        System.out.println("Department = "+ employee2.getDepartment());

        System.out.println("\nEmployee 3");
        System.out.println("Name = "+ employee3.getName());
        System.out.println("ID Number = "+ employee3.getidNumber());
        System.out.println("Position = "+ employee3.getPosition());
        System.out.println("Department = "+ employee3.getDepartment());
    }
}