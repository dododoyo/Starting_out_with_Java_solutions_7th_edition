import java.nio.file.spi.FileSystemProvider;

public class Temprature 
{
    double ftemp;
    public Temprature(double theFahrenheit)
    {
        ftemp = theFahrenheit;
    }
    public void setFahrenheit(double theFahrenheit)
    {
        ftemp = theFahrenheit;

    }
    public double getFahrenheit(double theFahrenheit)
    {
        return ftemp;
    }

    public double celsius()
    {
        double thecel = (ftemp-32)/1.8;
        return thecel;
    }
    public double kelvin()
    {
        double thekel = ((ftemp -32)/1.8) + 273;
        return thekel;
    }
    
}
