public class FreezingAndBoiling 
{
    double temprature;


    public FreezingAndBoiling(double theTemprature)
    {
        temprature = theTemprature;
    }
    public void setTemprature(double theTemprature)
    {
        temprature = theTemprature;
    }

    public double getTemprature(double theTemprature)
    {
        return theTemprature;
    }


    public boolean ISETHYLFREEZING()
    {
        if (temprature < -173)
        return true;
        else
        return false;
    }
    public boolean ISOXYGENFREEZING()
    {
        if (temprature < -362)
        return true;
        else
        return false;
    }
    public boolean ISWATERFREEZING()
    {
        if (temprature < 32)
        return true;
        else
        return false;

    }
    public boolean ISETHYLBOILING()
    {
        if (temprature > 172)
        return true;
        else
        return false;
    }
    public boolean ISOXYGENBOILING()
    {
        if (temprature > -306)
        return true;
        else
        return false;
    }
    public boolean ISWATERBOILING()
    {
        if (temprature > 212)
        return true;
        else
        return false;
    }
    
}
