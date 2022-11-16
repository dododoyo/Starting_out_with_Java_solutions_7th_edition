public class CourseGrade
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
               "Grade for the final exam is " + grades[3].getGrade();

    }

}