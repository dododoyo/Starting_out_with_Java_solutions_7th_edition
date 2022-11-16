import java.io.FileNotFoundException;
import java.util.Scanner;
public class ModifiedValidationDemo 
{
    
    public static void main(String[] args)throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);
        ModifiedAccountValidation machine = new ModifiedAccountValidation();
        System.out.print("Please enter your account number: ");
        int theAccount = keyboard.nextInt();
        boolean checker = machine.accountFinder(theAccount);
        if (checker)
        System.out.println("The account is valid.");
        else
        System.out.println("The account is invalid.");
         
    }

    
}
