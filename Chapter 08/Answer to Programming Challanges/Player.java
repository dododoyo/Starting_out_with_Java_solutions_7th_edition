public class Player 
{
    private int score;
    
    
    public int rollDice(Die thedie)
    {
        Die newDie = new Die(thedie);
        newDie.roll();
        score -= newDie.getValue();
        return newDie.getValue();
    }
    public int getScore()
    {
        return score;
    } 
    public void setScore(int theValue)
    {
        score = theValue;
    } 
    public void addScore(int theValue)
    {
        score += theValue;
    }
}
