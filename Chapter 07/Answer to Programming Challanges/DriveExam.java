public class DriveExam 
{
    char[] correctAnswers = {'B','D','A','A','C','A','B','A','C','D'
                            ,'B','C','D','A','D','C','C','D','D','A'};

    public int totalCorrect(char[] studentAnswers)
    {
        int score = 0;
        for (int i = 0; i <20; i++)
        {
        if (correctAnswers[i] == studentAnswers[i])
        score++;
        }
        return score;
    }


    public int totalIncorrect(char[] studentAnswers)
    {
        int score = 0;
        for (int i = 0; i <20; i++)
        {
        if (correctAnswers[i] != studentAnswers[i])
        score++;
        }
        return score;
    }


    public int[] questionsMissed(char[] studentAnswers)
    {
        int score = 0;
        for (int i = 0; i < 20; i++)
        {
        if ( studentAnswers[i] == ' ')
        score++;
        }
        int[] missed = new int[score];
        int index = 0;
        for (int i = 0; i < 20; i++)
        {
            if ( studentAnswers[i] == ' ')
            {
                missed[index] = i;
                index++;
            }
        }
        return missed;
        
    }


    public boolean passed(char[] studentAnswers)
    {
        int score = 0;
        for (int i = 0; i <20; i++)
        {
        if (correctAnswers[i] == studentAnswers[i])
        score++;
        }
        if (score>=15)
        return true;
        else
        return false;
    }
}
                            

    
    