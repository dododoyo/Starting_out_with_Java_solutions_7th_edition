public class primeChecker 
{
       public static void main(String[] args)
    {
        System.out.println(isPrime(11));//true
        System.out.println(isPrime(6));//false
    }


    public static boolean isPrime(int theNumber)
    {
        int theChecking = 0;
        for (int i = theNumber; i >=1; i--)
        {
            if (theNumber%i == 0)
            theChecking++;
        }
        if (theChecking==2)
        return true;
        else
        return false;
    }   
}
