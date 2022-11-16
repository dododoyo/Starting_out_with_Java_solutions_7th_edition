public class PassFailExam extends GradedActivity
{
    private double passFailExamScore;

    public double getScore()
    {
        return passFailExamScore;
    }

    public void setScore(double theScore)
    {
        passFailExamScore = theScore;
        super.setScore(passFailExamScore);
    }   
}
