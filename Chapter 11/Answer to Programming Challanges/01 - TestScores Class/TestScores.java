public class TestScores
{
    private int numberOfScores = 0 ;
    private double total =0 ;
    private double average;
    private double[] theScores;
    public TestScores(double[] scores)
    {
        theScores = scores;
    }

    public void calculateAverage()
    {
        for (double eachScore: theScores)
        {
            if (eachScore < 0 || eachScore >100)
            {
                throw new IllegalArgumentException("ERROR: Array contains invalid test score.");
            }
            total += eachScore;
            numberOfScores++;
        }
        average = total/numberOfScores;

    }

    public double getAverage()
    {
        return average;
    }
}