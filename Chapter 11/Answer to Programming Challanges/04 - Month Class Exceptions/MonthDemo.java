import javax.swing.JOptionPane;
public class MonthDemo 
{
    public static void main(String[] args)throws InvalidMonthName,InvalidMonthNumber
    {
        String monthName,monthNumber2;
        int monthNumber,choice;
        Month givenMonth = new Month();

        monthName =  JOptionPane.showInputDialog("Enter '1' if you wish to enter month name:"+
                                                  "\n Enter '2' if you wish to enter month number:");
        choice = Integer.parseInt(monthName);

        while (choice != 1 && choice != 2)
        {
            monthName =  JOptionPane.showInputDialog("Invalid Entry: " + 
                                                    "\nEnter '1' if you wish to enter month name:"+
                                                    "\n Enter '2' if you wish to enter month number:");
            choice = Integer.parseInt(monthName);
        }

        if (choice == 1)
        {
            monthName = JOptionPane.showInputDialog("Enter the name of the month: ");
            givenMonth.setMonthName(monthName); 
            JOptionPane.showMessageDialog(null, "Month name was set to "+ givenMonth.getMonthName());
        }
        else 
        {
            monthNumber2 = JOptionPane.showInputDialog("Enter the number of the month: ");
            monthNumber = Integer.parseInt(monthNumber2);
            givenMonth.setMonthNumber(monthNumber);
            JOptionPane.showMessageDialog(null, "Month number was set to " + givenMonth.getMonthNumber());
        }

    }
    
}
