import java.util.Scanner;
public class RestaurantBill 
{
    public static void main(String[] args)
    {
        double charge;
        final double taxrate = 0.0675;
        double tax;
        double tip;
        double totalCharge;
        double totalChargeBeforeTip;
        final double tiprate = 0.2;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the charge for the meal: ");
        charge = keyboard.nextDouble();

        tax = charge*taxrate;
        totalChargeBeforeTip = tax + charge;
        tip = totalChargeBeforeTip*tiprate;
        totalCharge = tip + totalChargeBeforeTip;
        System.out.println("The charge for the meal is: "+charge);
        System.out.println("The tax from the meal charge will be: "+tax);
        System.out.println("The tip from the meal charge will be: "+tip);
        System.out.println("The total charge of the meal charge will be: "+totalCharge);
    }
    
}
