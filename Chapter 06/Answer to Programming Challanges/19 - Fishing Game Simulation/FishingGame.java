import java.util.Scanner;
public class FishingGame 
{
    public static void main(String[] args)
    {
        Scanner  kb = new Scanner(System.in);
        Die die = new Die(6);
        String response;
        int total = 0;
        do
        {
            die.roll();
            System.out.print("Please enter 'Stop' if you wish to stop or" + "\n"+ 
                            "anything else if you wish to continue: ");
            response = kb.nextLine();
            response = response.toLowerCase();
            total+= die.getValue();

        }while(!(response.equals("stop")));

        System.out.println("\nThe total value of the fishing is:"+total);
        System.out.println("The message for the last game was:"+getMessage(die.getValue()));
    }

    

    public static String getMessage(int value)
    {
        String message = "";
        if (value == 1)
        message = "A huge fish";
        else if (value == 2)
        message = "An old shoe";
        else if (value == 3)
        message = "A little fish";
        else if (value == 4)
        message = "A tiny fish";
        else if (value == 5)
        message = "For tooth picking";
        else if (value == 6)
        message = "Almost no fish";
        return message;
    }
}
