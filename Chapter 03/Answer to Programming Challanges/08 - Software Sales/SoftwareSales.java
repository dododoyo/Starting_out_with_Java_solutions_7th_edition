import java.util.Scanner;
public class SoftwareSales 
{
    public static void main(String[] args)
    { 
        int packages;
        double purchase,discount;
        Scanner keyboard = new Scanner(System.in);
        final int retailPrice = 99;
        System.out.print("Please enter the number of packages purchased: ");
        packages = keyboard.nextInt();
        purchase = packages*retailPrice;
        if ( packages >=0 && packages<=9)
        {
            discount = 0.0*purchase;
        }
        else if ( packages >=10 && packages<=19)
        {
            discount = 0.2*purchase;
        }
        else if ( packages >=20 && packages<=49)
        {
            discount = 0.3*purchase;
        }
        else if ( packages >=50 && packages<=99)
        {
            discount = 0.2*purchase;
        }
        else if ( packages >=50)
        {
            discount = 0.5*purchase;
        }
        else 
        {
            System.out.println("Invalid amount of purchase");
            purchase = 0.0;
            discount= 0.0;
        }
        purchase = purchase - discount;
        System.out.println("The total amount of discount is: "+discount);
        System.out.println("The total purchase after discount is: "+purchase);  
    }   
}
