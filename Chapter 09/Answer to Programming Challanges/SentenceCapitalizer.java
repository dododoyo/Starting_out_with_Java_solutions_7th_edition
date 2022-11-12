public class SentenceCapitalizer 
{
    public static void main(String[] args)
    {
        System.out.println(capitalizer("hey. how are you. doing"));

    }

    public static String capitalizer(String theSentence)
    {
        theSentence.trim();
        String[] tokens = theSentence.split("[.!?]");
        String capitalizedSentence = "";
        for (String token: tokens)
        System.out.println(token);
        String capitalizedString = "";

        for (String eachString: tokens)
        {
            char[] sentenceArray = theSentence.toCharArray();
            boolean firstLetter = false;
            int k = 0;
            do
            {
                if (!Character.isWhitespace(sentenceArray[k]))
                {
                    char capitalFirstLetter = Character.toUpperCase(eachString.charAt(k));
                    sentenceArray[k] = capitalFirstLetter;
                    firstLetter = true;
                }
                k++;
            }while(firstLetter=false);

            
            capitalizedString = String.valueOf(sentenceArray);
            
        }
        capitalizedSentence = capitalizedSentence.concat(capitalizedString+";");
        return  capitalizedSentence;

    }
    
}
