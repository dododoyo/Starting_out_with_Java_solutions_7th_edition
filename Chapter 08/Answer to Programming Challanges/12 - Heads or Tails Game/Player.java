public class Player 
{
    private int Score;
    public String tossCoin(Coin theCoin)
    {
        Coin coin = new Coin(theCoin);
        coin.toss();
        return coin.getSideUp();
    }  
    public void addScore(int theScore)
    {
        Score += theScore;
    }
    public void setScore(int theScore)
    {
        Score = theScore;
    }
    public int getScore()
    {
        return Score;
    }
}
