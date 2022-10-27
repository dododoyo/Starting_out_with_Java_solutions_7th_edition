import java.util.Scanner;
public class MoblieServiceProvider2 
{
    public static void main(String[] args)
    {
        String ch;
        char newCh ;
        int additional;
        double packageCharges,total_charges, additionalCharges,additionalRate,saved1,saved2;
        packageCharges = 0.0;
        additionalRate = 0.0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Package A: $39.99 permonth, 450 minutes ");
        System.out.println("Additional minutes are 0.45 per minute.\n");
        System.out.println("Package A: $59.99 permonth, 900 minutes ");
        System.out.println("Additional minutes are 0.40 per minute.\n");
        System.out.println("Package A: $69.99 permonth, unlimited minutes \n");
        System.out.print("Please enter the letter of the package you want to purchase: ");
        ch = (keyboard.nextLine()).toUpperCase();
        newCh = ch.charAt(0);
        System.out.print("Please enter additional minutes required in this month: ");
        additional = keyboard.nextInt();
        switch (newCh)
        {
            case 'A':
            packageCharges = 39.99;
            additionalRate = 0.45;
            additionalCharges = additionalRate*additional;
            total_charges = packageCharges+additionalCharges;
            System.out.printf("The total charge for this month is: %,.2f\n",total_charges);
            saved1 = total_charges - 59.99;
            System.out.printf("The amount you would save if you bought package B is: %,.2f\n",saved1);
            saved2 = total_charges - 69.99;
            System.out.printf("The amount you would save if you bought package C is: %,.2f\n",saved2);
            break;

            case 'B':
            packageCharges = 59.99;
            additionalRate = 0.40;
            additionalCharges = additionalRate*additional;
            total_charges = packageCharges+additionalCharges;
            System.out.printf("The total charge for this month is: %,.2f\n",total_charges);
            saved2 = total_charges - 69.99;
            System.out.printf("The amount you would save if you bought package C is: %,.2f\n",saved2);
            break;

            case 'C':
            packageCharges = 69.99;
            additionalRate = 0.0;
            additionalCharges = additionalRate*additional;
            total_charges = packageCharges+additionalCharges;
            System.out.printf("The total charge for this month is: %,.2f\n",total_charges);
            break;
        }
        
        {

        }

    }
    
}
