public class Month 
{
    private int monthNumber;
    private String Name;
    private String[] monthName = {"january", "february", "march", "april",
                               "may", "june", "july", "august",
                               "september", "october", "november", "december"};

    public Month()
    {
        monthNumber = 1;
    }

    public Month(int theMonthNumber)throws InvalidMonthNumber
    {
        if (theMonthNumber<1 || monthNumber>12)
        throw new InvalidMonthNumber();
        else
        monthNumber = theMonthNumber;
    }
    public Month(String MonthName)throws InvalidMonthName
    {
        MonthName = MonthName.toLowerCase();
        if (MonthName.equals(monthName[0]))
        monthNumber = 1;
        else if (MonthName.equals(monthName[1]))
        monthNumber = 2;
        else if (MonthName.equals(monthName[2]))
        monthNumber = 3;
        else if (MonthName.equals(monthName[3]))
        monthNumber = 4;
        else if (MonthName.equals(monthName[4]))
        monthNumber = 5;
        else if (MonthName.equals(monthName[5]))
        monthNumber = 6;
        else if (MonthName.equals(monthName[6]))
        monthNumber = 7;
        else if (MonthName.equals(monthName[7]))
        monthNumber = 8;
        else if (MonthName.equals(monthName[8]))
        monthNumber = 9;
        else if (MonthName.equals(monthName[9]))
        monthNumber = 10;
        else if (MonthName.equals(monthName[10]))
        monthNumber = 11;
        else if (MonthName.equals(monthName[11]))
        monthNumber = 12;
        else 
        throw new InvalidMonthName();
    }
    public void setMonthNumber(int theMonthNumber)throws InvalidMonthNumber
    {
        if (theMonthNumber<1 || monthNumber>12)
        throw new InvalidMonthNumber();
        else
        monthNumber = theMonthNumber;
    }
    public void setMonthName(String theMonthName)throws InvalidMonthName
    {
        String MonthName = theMonthName.toLowerCase();

        if (MonthName.equals(monthName[0]) || MonthName.equals(monthName[1]) || MonthName.equals(monthName[2])
            || MonthName.equals(monthName[3]) || MonthName.equals(monthName[4]) || MonthName.equals(monthName[5])
            || MonthName.equals(monthName[6]) || MonthName.equals(monthName[7]) || MonthName.equals(monthName[8])
            || MonthName.equals(monthName[9]) || MonthName.equals(monthName[10]) || MonthName.equals(monthName[11]))
        Name = MonthName;
        else 
        throw new InvalidMonthName();   
    }

    public int getMonthNumber()
    {
        return monthNumber;
    }

    public String getMonthName(int theNum)
    {
        
        if (theNum ==1)
        Name = monthName[0];
        else if (theNum ==2)
        Name = monthName[1];
        else if (theNum ==3)
        Name = monthName[2];
        else if (theNum ==4)
        Name = monthName[3];
        else if (theNum ==5)
        Name = monthName[4];
        else if (theNum ==6)
        Name = monthName[5];
        else if (theNum ==7)
        Name = monthName[6];
        else if (theNum ==8)
        Name = monthName[7];
        else if (theNum ==9)
        Name = monthName[8];
        else if (theNum ==10)
        Name = monthName[9];
        else if (theNum ==11)
        Name = monthName[10];
        else 
        Name = monthName[11];
        return Name;

    }

    public String getMonthName()
    {
        return Name;
    }

    public boolean equals(Month theMonth)
    {
        if (monthNumber == theMonth.getMonthNumber())
        return true;
        else
        return false;
    }

    public boolean greaterThan(Month theMonth)
    {
        if (monthNumber > theMonth.getMonthNumber())
        return true;
        else 
        return false;
    }

    public boolean lessThan(Month theMonth)
    {
        if (monthNumber < theMonth.getMonthNumber())
        return true;
        else 
        return false;
    }
    public String toString()
    {
        return Name;
    }    
}
