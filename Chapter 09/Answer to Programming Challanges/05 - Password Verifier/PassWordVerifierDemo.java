import java.util.Scanner;
public class PassWordVerifierDemo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your password here: ");
        String password = keyboard.nextLine();
        PasswordVerifier checker = new PasswordVerifier();
        
        if (checker.isValid(password))
        System.out.println("The password you entered is valid.");
        else
        System.out.println("The password you entered is not valid.");

        

    }
    
}
