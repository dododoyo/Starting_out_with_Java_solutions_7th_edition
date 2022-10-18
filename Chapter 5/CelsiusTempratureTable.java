public class CelsiusTempratureTable 
{
    public static void main(String[] args)
    {
        System.out.println("Temprature in Fahreneit  Temprature in Celsius");
        for(double i = 0; i<=20;i++)
        System.out.printf(i+"\t\t\t   %,.2f\n",celsius(i));

    }
    

    public static double celsius(double theFahrenheit)
    {
        double theCelsius = (theFahrenheit-32)/1.8;
        return theCelsius;
    }
}
