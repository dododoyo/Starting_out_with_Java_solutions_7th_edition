public class VowelsAndConsonants 
{
    private String words;
    private int vowels;
    private int consonants;
    public VowelsAndConsonants(String theString)
    {
        words = theString;
    }
    public void devide()
    {
        char[] array = words.toCharArray();
        for (char character: array)
        {
            char lowerChar = Character.toLowerCase(character);
            if ( lowerChar == 'a' || 
                 lowerChar == 'e' ||
                 lowerChar == 'i' ||
                 lowerChar == 'o' ||
                 lowerChar == 'u' )
            {
              vowels++;
            }
            else if ( !Character.isWhitespace(lowerChar)&& Character.isLetter(character))
              consonants++;
        }
    }

    public int getVowels()
    {
        return vowels;
    }
    public int getConsonants()
    {
        return consonants;
    }

}
