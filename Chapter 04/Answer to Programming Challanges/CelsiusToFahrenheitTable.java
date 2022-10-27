public class CelsiusToFahrenheitTable 
{
    public static void main(String[] args)
    {
        double fah,cel;
        System.out.println("Celsius Temprature     Fahrenheit Temprature");
        System.out.println("-------------------------------------------");
        for (cel = 0;cel <= 20; cel++)
        {
            fah = (1.8*cel) +32;
            System.out.printf("|"+cel+"\t\t|\t %,.2f  \t|\n",fah);
        }
        System.out.println("-----------------------------------------");
    }   
}
