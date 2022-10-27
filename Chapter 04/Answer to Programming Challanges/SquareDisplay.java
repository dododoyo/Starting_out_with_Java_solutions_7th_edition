import java.util.Scanner;
public class SquareDisplay 
{
    public static void main(String[] args)
    {
        int size3,size4;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the size of your square:");
        int size = keyboard.nextInt();
        for (size3 = size ;size3>0;size3--)
        {
            for ( size4 = size;size4>0;size4--)
            {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
