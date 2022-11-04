import java.util.Random;
public class Die 
{
    private int sides;
    private int value;
    
    public Die(int numSides)
    {
        sides = numSides;
        roll();
    }

    public Die()
    {
        sides = 0;
        value = 0;
    }

    public Die(Die theDie)
    {
        sides = theDie.getSides();
        value = theDie.getValue();
    }

    public void roll()
    {
        Random rand = new Random();
        value = rand.nextInt(sides)+1;

    }

    public int getSides()
    {
        return sides;
    }

    public int getValue()
    {
        return value;
    }
}
