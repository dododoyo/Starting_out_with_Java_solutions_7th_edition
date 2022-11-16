import java.util.Scanner;
public class CashRegisterDemo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        final double itemPrice = 67;
        final String description = "Rice";
        RetailItem theItem = new RetailItem(description,itemPrice);
        System.out.print("Please enter the quantity of items being purchased: ");
        int quantity = keyboard.nextInt();

        CashRegister machine = new CashRegister(theItem, quantity);
        System.out.println("\nThe quantity of items being purchased is: "+machine.getQuantity());
        System.out.printf("The subtotal sales of items being purchased is: %,.2f\n",machine.getSubtotal());
        System.out.printf("The tax of items being purchased is: %,.2f\n", machine.getTax());
        System.out.printf("The total sales of items being purchased is: %,.2f\n",machine.getTotal());

    }
}
