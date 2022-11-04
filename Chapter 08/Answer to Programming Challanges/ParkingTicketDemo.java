import java.util.Scanner;
import java.io.*;
public class ParkingTicketDemo 
{
    public static void main(String[] args)throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);
        ParkedCar theCar = new ParkedCar();
        ParkingMeter theMeter = new ParkingMeter();
        PoliceOfficer theOfficer = new PoliceOfficer();
        PrintWriter typer = new PrintWriter("TheTicket.txt");

        String carMake ;
        String carModel;
        String carColor;
        String officerName;
        int officerBadge;
        int license;
        int purchasedminutes;
        int parkedMinutes;

        System.out.print("Please enter the make of the car: ");
        carMake = keyboard.nextLine();
        theCar.setCarMake(carMake);
        System.out.print("Please enter the model of the car: ");
        carModel = keyboard.nextLine();
        theCar.setCarModel(carModel);
        System.out.print("Please enter the color of the car: ");
        carColor = keyboard.nextLine();
        theCar.setCarColor(carColor);
        System.out.print("Please enter the license of the car: ");
        license = keyboard.nextInt();
        theCar.setCarLicense(license);
        System.out.print("Please enter the time parked in minutes: ");
        parkedMinutes = keyboard.nextInt();
        theCar.setParkedMinutes(parkedMinutes);

        System.out.print("Please enter the time purchased in minutes: ");
        purchasedminutes = keyboard.nextInt();
        theMeter.setPurchasedMinutes(purchasedminutes);
        System.out.print("Please enter the name of the officer: ");
        keyboard.nextLine();
        officerName = keyboard.nextLine();
        System.out.print("Please enter the badge number of the officer: ");
        officerBadge = keyboard.nextInt();
        theOfficer.setOfficerBadge(officerBadge);
        theOfficer.setOfficerName(officerName);
        theOfficer.issueTicket();

        typer.println("                 TICKET.");
        typer.println("                 -------");
        typer.println("This ticket is issued by: "+ theOfficer.getOfficerName());
        typer.println("Police's badge number is: "+ theOfficer.getOfficerBadge());
        typer.println("The make of the car is: "+ theCar.getCarMake());
        typer.println("The model of the car is: "+ theCar.getCarModel());
        typer.println("The color of the car is: "+ theCar.getCarColor());
        typer.println("The license of the car is: "+ theCar.getCarLicense());
        typer.println("The  number of minutes parked is: "+ theCar.getParkedMinutes());
        typer.println("The purchased number of minutes for parking is: "+ purchasedminutes);
        typer.println(theOfficer.getMessage());
        typer.println("The total amount to be fined is: "+ theOfficer.getFine());
        typer.close();
        
    }   
}
