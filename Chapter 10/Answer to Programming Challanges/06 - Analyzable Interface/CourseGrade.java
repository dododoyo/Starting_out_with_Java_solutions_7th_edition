public class CourseGrade implements Analyzable
{
    private GradedActivity[] grades = new GradedActivity[4]; 

    public void setLab(GradedActivity theLabMark)
    {
        grades[0]= theLabMark;
    }

    public void setPassFailExam(PassFailExam theExamMark)
    {
        grades[1] = theExamMark;
    }

    public void setEssay(Essay theEssay)
    {
        grades[2]= theEssay;
    }

    public void setFinalExam(FinalExam theFinalExam)
    {
        grades[3] = theFinalExam;

    }

    public double getAverage()
    {
        double total = (grades[0].getScore() +grades[1].getScore() + grades[2].getScore() + grades[3].getScore())/4;
        return total;
    }

    public GradedActivity getHighest()
    {
        double max = grades[0].getScore();
        int j = 0;
        for (int i = 0; i < 4; i++)
        {
            if (grades[i].getScore() > max)
            {
                max = grades[i].getScore();
                j = i;
            }
            
        }
        return grades[j];
    }

    public GradedActivity getLowest()
    {
        double max = grades[0].getScore();
        int j = 0;
        for (int i = 0; i < 4; i++)
        {
            if (grades[i].getScore() < max)
            {
                max = grades[i].getScore();
                j = i;
            }
            
        }
        return grades[j];
    }

    public String toString()
    {
        return "Scores for the lab activity is " + grades[0].getScore() +"\n" +
               "Grade for the lab activity is " + grades[0].getGrade() +
               "\n" +"\n" +
               "Scores for the pass/fail exam is " + grades[1].getScore() +"\n" +
               "Grade for the pass/fail exam is " + grades[1].getGrade() +
               "\n" +"\n" +
               "Scores for the essay is " + grades[2].getScore() +"\n" +
               "Grade for the essay is " + grades[2].getGrade() +
               "\n" +"\n" +
               "Scores for the final exam is " + grades[3].getScore() +"\n" +
               "Grade for the final exam is " + grades[3].getGrade() +
               "\n" +"\n" +
               "\n" +
               "The average of the scores is: " + getAverage() +
               "\n" +
               "The lowest value from the scores is: " + getLowest().getScore() +
               "\n" +
               "The highest of the scores is: " + getHighest().getScore();

    }

}