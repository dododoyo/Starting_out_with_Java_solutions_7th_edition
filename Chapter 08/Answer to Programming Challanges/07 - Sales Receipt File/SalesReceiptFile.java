import java.io.*;
import java.util.Scanner;
public class SalesReceiptFile
{
   public static void main(String[] args)throws FileNotFoundException
        {
        Scanner keyboard = new Scanner(System.in);
        PrintWriter Receipt = new  PrintWriter("Receipt.txt");
        final double itemPrice = 67;
        final String description = "Rice";
        

        System.out.print("Please enter the quantity of items being purchased: ");
        int itemNo = keyboard.nextInt();
        RetailItem theItem = new RetailItem(description,itemPrice);
        CashRegister theReceipt = new CashRegister(theItem,itemNo);
        
        Receipt.println("   SALES RECEIPT ");
        Receipt.println("Unit Price: "+ theItem.getPrice());
        Receipt.println("Quantity: "+ theReceipt.getQuantity());
        Receipt.println("Subtotal: $"+ theReceipt.getSubtotal());
        Receipt.printf("Sales Tax: $%,.2f\n", theReceipt.getTax());
        Receipt.println("Total: $"+theReceipt.getTotal());
        Receipt.close();
        }
        
    
}
