import java.util.Scanner;
public class PreferredCustomerDemo
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        PreferredCustomer cus1 = new PreferredCustomer();
        String prefer;

        System.out.print("Please enter the name of the customer: ");
        cus1.setName(kb.nextLine());
        System.out.print("Please enter the address of the customer: ");
        cus1.setAddress(kb.nextLine());
        System.out.print("Please enter the telephone number of the customer: ");
        cus1.setPhoneNumber(kb.nextLine());
        System.out.print("Please enter the customer number of the customer: ");
        cus1.setCustomerNumber(kb.nextLine());
        System.out.println("Please enter if the customer want to recieve emails about future products: ");
        System.out.println("Enter either 'true' or 'false' : ");
        prefer = kb.nextLine();
        while (!(prefer.equals("true") || prefer.equals("false")))
        {
            System.out.println("Enter either 'true' or 'false' again: ");
            prefer = kb.nextLine();
        }
        cus1.setMailingPreference(Boolean.parseBoolean(prefer));
        System.out.println("Please enter the total purchase of the customer:");
        cus1.setDiscount(kb.nextDouble());

        System.out.println("\nThe name of the customer is " +cus1.getName());
        System.out.println("The address of the customer is "+cus1.getAddress());
        System.out.println("The telephone number of the customer is "+cus1.getPhone());
        System.out.println("The customer number of the customer is "+cus1.getCustomerNumber());

        if (cus1.getMailingPreference() == true)
        System.out.println("The cutomer is on the mailing list.");
        else
        System.out.println("The cutomer is not on the mailing list.");
        System.out.println("The amount of discount the customer will receive for future purchases in percentage is: "+cus1.getDiscount());

    } 
}