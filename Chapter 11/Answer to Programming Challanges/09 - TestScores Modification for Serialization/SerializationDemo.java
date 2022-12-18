import java.io.*;

public class SerializationDemo
{
    public static void main(String[] args)
    {
        double[] tests1 = {12.6,8.0,34.0,55.8,67.9,34.5};
        //double[] tests1 = {12.6,8.0,34.0,55.8,67.9,34.5};
        double[] tests2 = {99.0,78.0,34.0,55.8,67.9,34.5};
        double[] tests3 = {12.6,39.0,34.0,55.8,67.9,76.3};
        double[] tests4 = {12.6,56.0,34.0,55.8,67.9,34.5};
        double[] tests5 = {12.6,87.0,34.0,55.8,67.9,43.5};
        double[] tests6 = {76.6,87.0,34.0,55.8,67.9,43.5};

        TestScoresMod student1 = new TestScoresMod(tests1);
        TestScoresMod student2 = new TestScoresMod(tests2);
        TestScoresMod student3 = new TestScoresMod(tests3);
        TestScoresMod student4 = new TestScoresMod(tests4);
        TestScoresMod student5 = new TestScoresMod(tests5);
        TestScoresMod student6 = new TestScoresMod(tests6);

        TestScoresMod[] listOfStudents = {student1,student2,student3,student4,student5,student6};
        System.out.println(student1.getAverage());
        System.out.println(student2.getAverage());

        // Serializing each element of the Array
        try
        {
            ObjectOutputStream objectFile = new ObjectOutputStream(new FileOutputStream("StudentTests.dat"));

            for(int index = 0; index <listOfStudents.length;index++)
            {
                objectFile.writeObject(listOfStudents[index]);
               // System.out.println(listOfStudents[index].getAverage());
            }
            objectFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("The file specified was not found.");
        }
        catch(IOException e)
        {
            System.out.println("Some IO exception occured.");
        }

       
    }
    
    
}
