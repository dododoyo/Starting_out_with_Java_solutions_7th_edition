import java.util.Scanner;
public class RunningRace 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String runner1,runner2,runner3,first,second,third;
        int minute1,minute2,minute3;
        System.out.print("Please enter name of the first runner: ");
        runner1 = keyboard.nextLine();
        System.out.print("Please enter the minutes he\\she took to finish: ");
        minute1 = keyboard.nextInt();
        System.out.print("Please enter name of the second runner: ");
        keyboard.nextLine();
        runner2 = keyboard.nextLine();
        System.out.print("Please enter the minutes he\\she took to finish: ");
        minute2 = keyboard.nextInt();
        System.out.print("Please enter name of the third runner: ");
        keyboard.nextLine();
        runner3 = keyboard.nextLine();
        System.out.print("Please enter the minutes he\\she took to finish: ");
        minute3 = keyboard.nextInt();
        if ((minute1<minute2) && (minute1<minute3))
        {
            if ((minute2<minute3))
            {
                first = runner1;
                second = runner2;
                third = runner3;
            }
            else 
            {
                first = runner1;
                second = runner3;
                third = runner2;
            }

        }
        else if ((minute3<minute2) && (minute3<minute1))
        {
            if ((minute2<minute1))
            {
                first = runner3;
                second = runner2;
                third = runner1;
            }
            else 
            {
                first = runner3;
                second = runner1;
                third = runner2;
            }

        }
        else if ((minute2<minute3) && (minute2<minute1))
        {
            if ((minute3<minute1))
            {
                first = runner2;
                second = runner3;
                third = runner1;
            }
            else 
            {
                first = runner2;
                second = runner1;
                third = runner3;
            }

        }
        else 
        {
            System.out.println("Invalid entry.");
            first = " ";
            second = " ";
            third = " ";
        }
        System.out.println(first+" finished First.");
        System.out.println(second+" finished Second.");
        System.out.println(third+" finished Third.");


    }
    
}
