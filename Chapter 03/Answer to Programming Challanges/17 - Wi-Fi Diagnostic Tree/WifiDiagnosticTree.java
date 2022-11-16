import java.util.Scanner;
public class WifiDiagnosticTree 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String response;
        System.out.println("Reboot the computer and try to connect.");
        System.out.print("Did that fix the problem?  ");
        response = (keyboard.nextLine()).toLowerCase();
        if (response.equals("no"))
        {
            System.out.println("Reboot the router and try to connect.");
            System.out.print("Did that fix the problem?  ");
            response = (keyboard.nextLine()).toLowerCase();
            if (response.equals("no"))
            {
                System.out.println("Make sure the cables between the router & the modem are plugged in firmly.");
                System.out.print("Did that fix the problem?  ");
                response = (keyboard.nextLine()).toLowerCase();
                if (response.equals("no"))
                {
                    System.out.println("Move the router to a new location and try to connect."); 
                    System.out.print("Did that fix the problem?  ");
                    response = (keyboard.nextLine()).toLowerCase();
                    if (response.equals("no"))
                    {
                        System.out.println("Get a new router.");    
                    }
                }
            }
        }
    }
}
