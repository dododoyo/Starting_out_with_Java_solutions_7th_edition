import java.util.Scanner;
public class PlantingGrapevines 
{
    public static void main(String[] args)
    {
        double grapevines;
        double row;
        int endSpace;
        int Space;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the length of the row, in feet: ");
        row = keyboard.nextDouble();
        System.out.print("Please enter the amount of space used by an end-post assembly: ");
        endSpace = keyboard.nextInt();
        System.out.print("Please enter the space between vines, in feet: ");
        Space = keyboard.nextInt();
        grapevines = (row - 2*(endSpace))/Space;
        System.out.print("The number of grapevines that will fit in the row is: "+ grapevines);

    }
    
}
