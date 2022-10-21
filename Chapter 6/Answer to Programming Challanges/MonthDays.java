public class MonthDays 
{
    int year;
    int theMonth;
    int day;
    public MonthDays(int theYear, int month)
    {
        year = theYear;
        theMonth = month;  
    }
    public boolean isLeap(int theYear)
    {
        if (((theYear % 400 ==0) && (theYear % 100 ==0)) || ((theYear%100 != 0)&&(theYear%4==0)))
        return true;

        else
        return false;
    }
    public int numberOfDays()
    {
        if ((theMonth==1) ||(theMonth==3) || (theMonth ==5) || (theMonth==7)
           || (theMonth==8) || (theMonth==10) || (theMonth==12))
           day = 31;
        else if ((theMonth==4)|| (theMonth==6) || (theMonth ==9)|| (theMonth==11))
        day = 30;
        else if ((theMonth == 2) && (isLeap(year)))
        day = 29;
        else 
        day = 28;
        return day;
    }
    
}
