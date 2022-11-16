public class ShipDemo 
{
    public static void main(String[] args)
    {
        Ship[] Ship1 = new Ship[3];
        Ship1[0] = new Ship("The Bismark", "February 14, 1939");
        Ship1[1] = new CruiseShip("Wonder of the Seas","May 9, 2019",6988);
        Ship1[2] = new CargoShip("OOCL HONG KONG", "December 24, 2015",21413);
        for (int i = 0; i < 3; i++)
        {
            System.out.println(Ship1[i].toString());
            System.out.println();
        }
    }
    
}
