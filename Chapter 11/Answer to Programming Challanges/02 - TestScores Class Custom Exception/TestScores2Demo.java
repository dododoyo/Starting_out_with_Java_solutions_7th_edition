public class TestScores2Demo
{
    public static void main(String[] args) throws InvalidTestScore
    {
        double[] tests1 = {12.6,8.0,34.0,55.8,67.9,34.5};
        double[] tests2 = {12.6,-78.0,34.0,55.8,67.9,34.5};

        TestScores2 Student1 = new TestScores2(tests1);
        TestScores2 Student2 = new TestScores2(tests2);
        
        Student1.calculateAverage();
        System.out.println(Student1.getAverage());
        Student2.calculateAverage();
        System.out.println(Student2.getAverage());
    }
    
    
}
