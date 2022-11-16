import java.util.Scanner;
public class CheckWriter 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the date in the format dd/mm/yyyy: ");
        String date = keyboard.nextLine();
        System.out.print("Please enter the name of payee: ");
        String name = keyboard.nextLine();
        System.out.print("Please enter the amount written in the check upto 9999: ");
        Double amount = keyboard.nextDouble();
        while (amount >= 10000 || amount < 0)
        {
            System.out.println("Please enter the amount written in the check upto 9999: ");
            amount = keyboard.nextDouble();   
        }

        SpellOut speller = new SpellOut(amount);
        
        System.out.println("\nDate: "+date);
        System.out.println("Pay to the order of: "+name);
        System.out.println("$"+amount);
        System.out.println(speller.spell());  
    }
    
}
