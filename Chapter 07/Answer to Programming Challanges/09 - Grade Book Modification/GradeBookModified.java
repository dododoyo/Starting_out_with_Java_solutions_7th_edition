public class GradeBookModified 
{
    String[] names = new String[5];
    char[] grades = new char[5];
    double[] TestScores1 = new double[4];
    double[] TestScores2 = new double[4];
    double[] TestScores3 = new double[4];
    double[] TestScores4 = new double[4];
    double[] TestScores5 = new double[4];


    public String getName(int studentIndex)
    {
        return names[studentIndex];
    }

    public void setName(int index,String name)
    {
        names[index] = name;
    }

    public void setGrades(int index,char grade)
    {
        grades[index] = grade;

    }


    public void setTestScores1(int index, double score)
    {
        TestScores1[index] = score;
    }
    public void setTestScores2(int index, double score)
    {
        TestScores2[index] = score;
    }
    public void setTestScores3(int index, double score)
    {
        TestScores3[index] = score;
    }
    public void setTestScores4(int index, double score)
    {
        TestScores4[index] = score;
    }
    public void setTestScores5(int index, double score)
    {
        TestScores5[index] = score;
    }


    public double getTestScore1(int index)
    {
        return TestScores1[index];
    }
    public double getTestScore2(int index)
    {
        return TestScores2[index];
    }
    public double getTestScore3(int index)
    {
        return TestScores3[index];
    }
    public double getTestScore4(int index)
    {
        return TestScores4[index];
    }
    public double getTestScore5(int index)
    {
        return TestScores5[index];
    }


    public double getaverageScore(double[] array)
    {
        double total = 0,minvalue;
        int startScan, index, minindex;
        for (startScan = 0; startScan < (array.length - 1); startScan++)
        {
            minindex = startScan;
            minvalue = array[startScan];
            for (index = (startScan+1); index <array.length;index++)
            {
                if (array[index] < minvalue)
                {
                    minindex = index;
                    minvalue = array[index];
                }
            }
            array[minindex] = array[startScan];
            array[startScan] = minvalue;
        }
        double[] newArray = new double[(array.length - 1)];
        for (int j = 0; j < (array.length - 1);j++)
        {
            newArray[j] = array[j];
        }
        
        for (int i = 0; i < newArray.length ; i++)
        {
            total += newArray[i];
        }
        double average = total/4;
        return average;
    }

    public char getgradeScore(double[] array)
    {
        char grade;
        double total = 0,minvalue;
        int startScan, index, minindex;
        for (startScan = 0; startScan < (array.length - 1); startScan++)
        {
            minindex = startScan;
            minvalue = array[startScan];
            for (index = (startScan+1); index <array.length;index++)
            {
                if (array[index] < minvalue)
                {
                    minindex = index;
                    minvalue = array[index];
                }
            }
            array[minindex] = array[startScan];
            array[startScan] = minvalue;
        }
        double[] newArray = new double[(array.length - 1)];
        for (int j = 0; j < (array.length - 1);j++)
        {
            newArray[j] = array[j];
        }
        
        for (int i = 0; i < newArray.length ; i++)
        {
            total += newArray[i];
        }
        double average = total/4;

        if (average>=90 && average <=100)
        grade = 'A';
        else if (average>=80 && average <=89)
        grade ='B';
        if (average>=70 && average <=79)
        grade = 'C';
        else if (average>=60 && average <=69)
        grade = 'D';
        else if (average>=0 && average <=59)
        grade ='F';
        else 
        grade = 'X';
        return grade;
    }   

    
}
