class distanceTraveled
{
    public static void main(String[] args)
    {
// The following values are random values used for checking the method
        double time = 2;
        double speed = 3;
        double distance = distance(speed, time);
        System.out.println(distance);

    }
    public static double distance(double speed,double time)
    {
        double thedistance = time*speed;
        return thedistance;
    }
}