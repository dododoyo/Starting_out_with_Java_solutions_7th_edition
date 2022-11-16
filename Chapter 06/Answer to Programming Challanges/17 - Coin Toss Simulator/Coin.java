import java.util.Random;
public class Coin 
{
    String sideUp;
    Random rand = new Random();
    int side = rand.nextInt(2);

    public Coin(){
        if (side==0)
        sideUp = "heads";
        else
        sideUp = "tails";
    }

    public void toss(){
        side = rand.nextInt(2);
        if (side==0)
        sideUp= "heads";
        else
        sideUp = "tails";
    }
    public String getSideUp()
    {
        return sideUp;
    }
}
