import java.util.Scanner;
public class ShippingCharges 
{
    public static void main(String[] args)
    {
        double weight,ratePerMiles,shippingCharges;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the weight of the package: ");
        weight = keyboard.nextDouble();
        if (weight > 0 && weight <=2)
        {
            ratePerMiles = 1.10;
        }
        else if (weight > 2 && weight <=6)
        {
            ratePerMiles = 2.20;
        }
        else if (weight > 6 && weight <=10)
        {
            ratePerMiles = 3.70;
        }
        else if (weight > 10 )
        {
            ratePerMiles = 3.80;
        }
        else 
        {
            System.out.println("Invalid amount");
            ratePerMiles = 0;
        }
        shippingCharges = ratePerMiles*weight;
        System.out.printf("The total shipping charges are: %,.2f",shippingCharges);
    }  
}
