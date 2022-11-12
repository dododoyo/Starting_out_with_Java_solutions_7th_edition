public class CarInstrumentsDemo 
{
    public static void main(String[] args)
    {
        
        FuelGauge instrument2 = new FuelGauge();

        for (int i = 0; i<16 ; i++)
        {
            instrument2.increaseFuel();
            System.out.println("Amount of fuel left in the tank is: "+instrument2.getFuel());
        }
        int maxFuel = instrument2.getFuel();
        Odometer instrument1 = new Odometer();
        System.out.println();
        for (int i =0; i < 36 ; i++)
        {
            for (int j = 0 ; j<10 ;j++)
            instrument1.increaseMilage();
            System.out.println("The current milage of the car is: "+ instrument1.getCarMilage());
            instrument2.setFuel(maxFuel);
            System.out.println("Amount of fuel left after used in the tank is: "+instrument1.getFuel(instrument2));
        }

    }
    
}
