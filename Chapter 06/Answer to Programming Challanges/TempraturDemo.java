import java.util.Scanner;
public class TempraturDemo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter temprature value in Fahrenheit: ");
        double fah = keyboard.nextDouble();
        Temprature thermo = new Temprature(fah);
        double cel = thermo.celsius();
        double kel = thermo.kelvin();
        System.out.printf("\nThe value of the entered Temprature in celsius is: %,.2f\n", cel);
        System.out.printf("The value of the entered Temprature in kelvin is: %,.2f", kel);

    }
    
}
