public class SpellOut 
{
    private String valueSpelled;

    public SpellOut(double theNumber)
    {
        // Can only spell upto 9999.99 ;-)
        String amount = Double.toString(theNumber);
        String[] amountArray = amount.split("[.]"); 
        int cents = Integer.valueOf(amountArray[1]);
        String cent = Integer.toString(cents);
        int dollars = Integer.valueOf(amountArray[0]);
        int length = amountArray[0].length();
        switch(length)
        {
            case 1:
            valueSpelled = onth(dollars) + " and " + cent + " cents." ;
            break;
            case 2:
            valueSpelled = tens(dollars) + " and " + cent + " cents.";
            break;
            case 3:
            valueSpelled = hundreds(dollars) + " and " +  cent + " cents.";
            break;
            case 4:
            valueSpelled = thousands(dollars) + " and " +  cent + " cents.";
            break;
            default:
            valueSpelled = "Invalid entry detected";
            /*
            case 5:
            valueSpelled = tenthousands(dollars) + " and " +  cent + " cents.";
            break;
            case 6:
            valueSpelled = hundredthousands(dollars) + " and " +  cent + " cents.";
            break;
            case 7:
            valueSpelled = millions(dollars) + " and " +  cent + " cents.";
            break;
            case 8:
            valueSpelled = tenmillions(dollars) + " and " +  cent + " cents.";
            break;
            case 9:
            valueSpelled = hundredmillions(dollars) + " and " +  cent + " cents.";
            break;
            */

        }
        
    }


    public String spell()
    {
        return valueSpelled;
    }


    public String onth(int theValue)
    {
        String spelled = "";
        switch (theValue)
        {
            case 0:
            spelled = "zero";
            break;
            case 1:
            spelled = "one";
            break;
            case 2:
            spelled = "two";
            break;
            case 3:
            spelled = "three";
            break;
            case 4:
            spelled = "four";
            break;
            case 5:
            spelled = "five";
            break;
            case 6:
            spelled = "six";
            break;
            case 7:
            spelled = "seven";
            break;
            case 8:
            spelled = "eight";
            break;
            case 9:
            spelled = "nine";
            break;
        }
        return spelled;
    }


    public String tens(int theValue)
    {
        String spelled = "";
        switch (theValue)
        {
            case 10:
            spelled = "ten";
            break;
            case 11:
            spelled = "eleven";
            break;
            case 12:
            spelled = "twelve";
            break;
            case 13:
            spelled = "thirteen";
            break;
            case 14:
            spelled = "fourteen";
            break;
            case 15:
            spelled = "fifteen";
            break;
            case 16:
            spelled = "sixteen";
            break;
            case 17:
            spelled = "seventeen";
            break;
            case 18:
            spelled = "eighteen";
            break;
            case 19:
            spelled = "nineteen";
            break;
            case 20:
            spelled = "twenty";
            break;
            case 30:
            spelled = "thirty";
            break;
            case 40:
            spelled = "fourty";
            break;
            case 50:
            spelled = "fifty";
            break;
            case 60:
            spelled = "sixty";
            break;
            case 70:
            spelled = "seventy";
            break;
            case 80:
            spelled = "eighty";
            break;
            case 90:
            spelled = "ninety";
            break;
            default:
            int  ones = theValue%10;
            int tenth = theValue/10;
            spelled = tens(tenth*10) +" "+ onth(ones); 
            break;
        }
        return spelled;
    }
    

    public String hundreds(int theValue)
    {
        String spelled = "";
        switch (theValue)
        {
            case 100:
            spelled = "one hundred";
            break;
            case 200:
            spelled = "two hundred";
            break;
            case 300:
            spelled = "three hundred";
            break;
            case 400:
            spelled = "four hundred";
            break;
            case 500:
            spelled = "five hundred";
            break;
            case 600:
            spelled = "six hundred";
            break;
            case 700:
            spelled = "seven hundred";
            break;
            case 800:
            spelled = "eight hundred";
            break;
            case 900:
            spelled = "nine hundred";
            break;
            default:
            int tenth = theValue%100;
            int hundredth = theValue/100;
            spelled = hundreds(hundredth*100) +" "+ tens(tenth) ; 
            break;
        }
        return spelled;
    }


    public String thousands(int theValue)
    {
        String spelled = "";
        switch (theValue)
        {
            case 1000:
            spelled = "one thousand";
            break;
            case 2000:
            spelled = "two thousand ";
            break;
            case 3000:
            spelled = "three thousand";
            break;
            case 4000:
            spelled = "four thousand";
            break;
            case 5000:
            spelled = "five thousand";
            break;
            case 6000:
            spelled = "six thousand";
            break;
            case 7000:
            spelled = "seven thousand";
            break;
            case 8000:
            spelled = "eight thousand";
            break;
            case 9000:
            spelled = "nine thousand";
            break;
            default:
            int thosands = theValue/1000;
            int hundredth = theValue%1000;
            spelled = thousands(thosands*1000) +" "+hundreds(hundredth)  ; 
            break;
        }
        return spelled;
    }
}
