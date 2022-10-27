public class Question 
{
    String thequestion;
    String ans1;
    String ans2;
    String ans3;
    String ans4;
    int correct;

    
    public Question(String theQuestion, String PossibleAnswer1, String PossibleAnswer2, String PossibleAnswer3, String PossibleAnswer4, int correctAnswer)
    {
        thequestion = theQuestion;
        ans1 = PossibleAnswer1;
        ans2 = PossibleAnswer2;
        ans3 = PossibleAnswer3;
        ans4 = PossibleAnswer4;
        correct = correctAnswer;
    }


    public void setQuestion(String theQuestion)
    {
        thequestion = theQuestion;
    }
    public void setPossibleAns1(String Answer1)
    {
        ans1 = Answer1;
    }
    public void setPossibleAns2(String Answer2)
    {
        ans1 = Answer2;
    }
    public void setPossibleAns3(String Answer3)
    {
        ans1 = Answer3;
    }
    public void setPossibleAns4(String Answer4)
    {
        ans1 = Answer4;
    }
    public void setCorrectAns(int theCorrectAnswer)
    {
        correct = theCorrectAnswer;
    }


    public String getQuestion()
    {
        return thequestion;
    }
    public String getAnswer1()
    {
        return ans1;
    }
    public String getAnswer2()
    {
        return ans2;
    }
    public String getAnswer3()
    {
        return ans3;
    }
    public String getAnswer4()
    {
        return ans4;
    }
    public int getCorrectAns()
    {
        return correct;
    }
}
