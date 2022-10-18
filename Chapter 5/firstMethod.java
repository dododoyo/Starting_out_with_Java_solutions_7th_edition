public class firstMethod
{
    public static void main(String[] args)
    {
        showChar("Adiss Ababa" , 3);
    }

    public static void showChar(String  word,int  index)
    {
        char  theLetter;
        theLetter = word.charAt(index);
        System.out.println(theLetter);

    }
}