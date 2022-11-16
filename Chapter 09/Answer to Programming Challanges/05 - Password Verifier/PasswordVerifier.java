public class PasswordVerifier
{
    private boolean goodSoFar;

    public boolean isValid(String thePassword)
    {
        goodSoFar = true;
        int counter1 = 0;
        char[] password = thePassword.toCharArray();

        if (password.length <6)
        goodSoFar = false;

        for (char letter:password)
        {

            if (Character.isUpperCase(letter))
            counter1++;
        }
        if (counter1 == 0)
        goodSoFar = false;

        counter1 = 0;
        for (char letter:password)
        {

            if (Character.isLowerCase(letter))
            counter1++;
        }
        if (counter1 == 0)
        goodSoFar = false;

        counter1 = 0;
        for (char letter:password)
        { 
            if (Character.isDigit(letter))
            counter1++;
        }
        if (counter1 == 0)
        goodSoFar = false;

        return goodSoFar;
    }
}
