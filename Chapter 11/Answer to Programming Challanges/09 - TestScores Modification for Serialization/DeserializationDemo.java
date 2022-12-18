import java.io.*;
public class DeserializationDemo 
{
    public static void main(String[] args)
    {
        boolean endOfFile = false;
        try
        {
            int studentNumber = 1;
            ObjectInputStream scanner = new ObjectInputStream(new FileInputStream("StudentTests.dat"));

            while(!endOfFile)
            {
                TestScoresMod sampleStud ;
                sampleStud = (TestScoresMod)scanner.readObject();
                System.out.println("The average score of student number "+ studentNumber +" is " + sampleStud.getAverage());
                studentNumber++;

            }
            ;

            /*TestScoresMod[] testList = new TestScoresMod[6];
            for (int index = 0; index < testList.length ;index++)
            {
                testList[index] = (TestScoresMod) scanner.readObject();
                System.out.println(testList[index].getAverage());
            }*/
            scanner.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("The file specified was not found.");
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("The class specified was not found.");
        }
        catch(EOFException e)
        {
            endOfFile = true;
        }
        catch(IOException e)
        {
            System.out.println(e.getLocalizedMessage());
            //System.out.println("Some IO exception occured.");
        }

    }
    
}
