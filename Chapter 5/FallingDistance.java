public class FallingDistance 
{
    public static void main(String[] args)
    {
        System.out.println("Time \t Distance");
        System.out.println("-------------------------");
        for (double i = 1; i<=10;i++)
        System.out.printf(i+" \t  %,.2f\n",fallingDistance(i));

    }
    public static double fallingDistance(double theTime)
    {
        double theDistance = 4.9*(theTime)*theTime;
        return theDistance;
    }
    
}
