public class RoulettePocket 
{
    String color;
    int Number ;
    public RoulettePocket(int theNumber){
        Number = theNumber;

    }
    public String getPocketColor()
    {
        if (Number == 0)
        color = "green";
        if (Number >= 1 && Number<=10)
        {
            if (Number%2 ==0)
            color  = "black";
            else
            color = "red";
        }
        else if (Number >= 11 && Number<=18)
        {
            if (Number%2 ==0)
            color  = "red";
            else
            color = "black";
        }
        else if (Number >= 19 && Number<=28)
        {
            if (Number%2 ==0)
            color  = "black";
            else
            color = "red";
        }
        else if (Number >= 29 && Number<= 36)
        {
            if (Number%2 ==0)
            color  = "red";
            else
            color = "black";
        }
        return color;
    }
    
}
