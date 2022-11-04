import java.util.Scanner;
public class RoomCarpetDemo
{
    public static void main(String[] args)
    {
        double length;
        double width;
        double cost;
        Scanner keyboard = new Scanner(System.in);
        
        
        System.out.println("Westfield Carpet Company.\n");
        System.out.print("Please enter the width of the room in feet: ");
        width = keyboard.nextDouble();
        System.out.print("Please enter the length of the room in feet: ");
        length = keyboard.nextDouble();
        System.out.print("Please enter the cost of carpeting per square foot: ");
        cost = keyboard.nextDouble();
        System.out.println(cost);
        RoomDimension thedimensions = new RoomDimension(length,width);
        RoomCarpet theRoom = new RoomCarpet(thedimensions,cost);

        System.out.println();
        System.out.println(theRoom);

    }

}