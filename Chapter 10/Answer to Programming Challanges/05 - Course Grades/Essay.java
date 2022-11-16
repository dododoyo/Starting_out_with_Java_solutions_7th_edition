public class Essay extends GradedActivity
{
    private double grammarPoints;
    private double spellingPoints;
    private double correctLength;
    private double contentPoints;

    public void setGrammerPoints(double theGrammarPoints)
    {
        grammarPoints = theGrammarPoints;
    }
    public void setSpellingPoints(double theSpellingPoints)
    {
        spellingPoints = theSpellingPoints;
    }
    public void setLengthPoints(double theLengthPoints)
    {
        correctLength = theLengthPoints;
    }
    public void setContentPoints(double theContentPoints)
    {
        contentPoints = theContentPoints;
    }
    public void setScores()
    {
        super.setScore(grammarPoints+spellingPoints+correctLength+contentPoints);
    }

    public double getGrammarPoints()
    {
        return grammarPoints;
    }
    public double getContentPoints()
    {
        return contentPoints;
    }
    public double getLengthPoint()
    {
        return correctLength;
    }
    public double getSpellinPoint()
    {
        return spellingPoints;
    }
}
