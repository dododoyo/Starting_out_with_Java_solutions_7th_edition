import java.util.Scanner;
public class HotelOccupancy 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int floors,firstFloor;
        double floorRoom,vacantrooms,occupiedrooms=0,occupancyRate,totalroom=0;
        System.out.print("Please enter how many floors the hotel has: ");
        floors = keyboard.nextInt();
        while (floors < 1)
        {
            System.out.println("The total number of rooms must be more than '1'");
            System.out.print("Please enter how many floors the hotel has again: ");
        floors = keyboard.nextInt();
        }
        for ( firstFloor = 1;firstFloor<=floors;firstFloor++)
        {
            System.out.println();
            System.out.print("Please enter how many rooms exist in the floor "+ firstFloor+": ");
            floorRoom = keyboard.nextInt();
            while (floorRoom < 10)
            {
                System.out.println("The number of rooms entered are unacceptable.");
                System.out.print("Please enter how many rooms exist in the floor "+ firstFloor+" again: ");
                floorRoom = keyboard.nextInt();
            }
            totalroom += floorRoom;

            System.out.print("Please enter how many rooms are occupied in floor "+ firstFloor+": ");
            occupiedrooms += keyboard.nextInt();
            while (occupiedrooms > totalroom)
            {
                System.out.println("\n***************************************************");
                System.out.println("The number of occupied rooms can't exceed total rooms");
                System.out.println("Please restart the program.");
                System.out.println("************************************************");
                System.exit(0);
            }
        }
        vacantrooms = totalroom - occupiedrooms;
        occupancyRate = (occupiedrooms/totalroom)*100;
        System.out.println();
        System.out.println("The total number of rooms is equal to: "+totalroom);
        System.out.println("The total number of vacant rooms is equal to: "+vacantrooms);
        System.out.println("The total number of occupied rooms is equal to: "+occupiedrooms);
        System.out.printf("The total occupancy rate of the hotel in percent is equal to: %,.2f",occupancyRate);
    } 
}
