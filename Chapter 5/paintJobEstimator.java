import java.util.Scanner;
public class paintJobEstimator 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of rooms to be painted: ");
        double rooms = keyboard.nextDouble();
        System.out.print("Please enter the price of paint per gallon: ");
        double pricePerGallon = keyboard.nextDouble();
        System.out.print("Please enter area of each room: ");
        double eachRoomArea = keyboard.nextDouble();
        double totalGallons = gallons(rooms, eachRoomArea);
        double totalLabourHour = laborHour(totalGallons);
        double totalLabourCharge = totalLabourCost(totalGallons);
        double totalPaintCost = totalPaintCost(totalGallons, pricePerGallon);
        double totalCost = totalLabourCharge+totalPaintCost;
        System.out.printf("\nThe number of gallons of paint required is: %,.2f\n",totalGallons);
        System.out.printf("The hours of labor required is: %,.2f\n", totalLabourHour);
        System.out.printf("The total cost of the paint is: %,.2f\n",totalPaintCost);
        System.out.printf("The  total labour charges is: %,.2f\n", totalLabourCharge);
        System.out.printf("The total cost of the pain job is: %,.2f\n",totalCost);
    }


    public static double gallons(double theRooms, double theEachRoomArea)
    {
        final double areaPerGallon = 115.0;
        double totalArea = theEachRoomArea*theRooms;
        double totalGallon = totalArea/areaPerGallon;
        return totalGallon;
    }


    public static double laborHour(double theGallon)
    {
        final double hourPerGallon = 8;
        double theHour = theGallon*hourPerGallon;
        return theHour;
    }


    public static double totalLabourCost(double theGallon )
    {
        final double labourPergallon = 18;
        double totalLabour = labourPergallon*theGallon;
        return totalLabour;
    }
    public static double totalPaintCost(double theGallon, double thePricePerGallon)
    {
        double totalCost = theGallon*thePricePerGallon;
        return totalCost;
    }
}
    