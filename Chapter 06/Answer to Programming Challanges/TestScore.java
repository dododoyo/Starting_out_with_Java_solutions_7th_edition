public class TestScore 
{
    double test1;
    double test2;
    double test3;
    public TestScore(double Test1, double Test2, double Test3)
    {
         test1 = Test1;
         test2 = Test2;
         test3 = Test3;
    }
    
    public void setTest1(double Test1)
    {
        test1 = Test1;
    }
    public void setTest2(double Test2)
    {
        test2 = Test2;
    }
    public void setTest3(double Test3)
    {
        test3 = Test3;
    }

    public double getTest1()
    {
        return test1;
    }
    public double getTest2()
    {
        return test2;
    }
    public double getTest3()
    {
        return test3;
    }

    public double getAverageScore()
    {
        return (test1+test2+test3)/3;
    }
}
