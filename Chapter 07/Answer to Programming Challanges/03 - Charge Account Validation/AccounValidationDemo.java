import java.util.Scanner;
public class AccounValidationDemo {
    public static void main(String[] args)
    {
        int[] accountList = {5658845, 4520125, 7895122, 8777541, 8451277,  7825877, 
            1302850, 8080152, 4562555, 5552012, 5050552, 1250255,
            1005231 ,6545231 ,3852085 ,7576651 ,7881200, 4581002};
        
        Scanner keyboard = new Scanner(System.in);
        ChargeAccountValidation machine = new ChargeAccountValidation();
        System.out.print("Please enter your account number: ");
        int theACcount = keyboard.nextInt();
        machine.selectionSort(accountList);
        boolean checker = machine.accountFinder(accountList, theACcount);
        if (checker)
        System.out.println("The account is valid.");
        else
        System.out.println("The account is invalid.");
         
    }
}