import java.util.Scanner;
public class GradeBookDemo 
{
    public static void main(String[] args)
    {
        String[] names = new String[5];
        char[] grades = new char[5];
        double[] TestScores1 = new double[4];
        double[] TestScores2 = new double[4];
        double[] TestScores3 = new double[4];
        double[] TestScores4 = new double[4];
        double[] TestScores5 = new double[4];


        Scanner keyboard = new Scanner(System.in);
        GradeBookModified newBook = new GradeBookModified();


        for (int  i =0; i < 5;i++)
        {
            System.out.print("Please enter name of student " +(i+1)+" : ");
            String name = keyboard.nextLine();
            newBook.setName(i, name);

        }

        System.out.println();
        for (int i = 0; i<4 ;i++)
        {
            System.out.print("Please enter the score for student 1 on test "+(i+1)+": ");
            double theScore = keyboard.nextDouble();
            while (theScore<0 || theScore >100)
            {
                System.out.print("Invalid Entry.");
                System.out.print("Please enter the score for student 1 on test "+(i+1)+": ");
                theScore = keyboard.nextDouble();
                
            }
            newBook.setTestScores1(i, theScore);
        }
        System.out.println();
        for (int i = 0; i<4 ;i++)
        {
            System.out.print("Please enter the score for student 2 on test "+(i+1)+": ");
            double theScore = keyboard.nextDouble();
            while (theScore<0 || theScore >100)
            {
                System.out.print("Invalid Entry.");
                System.out.print("Please enter the score for student 3 on test "+(i+1)+": ");
                theScore = keyboard.nextDouble();
                
            }
            newBook.setTestScores2(i, theScore);
        }
        System.out.println();
        for (int i = 0; i<4 ;i++)
        {
            
            System.out.print("Please enter the score for student 3 on test "+(i+1)+": ");
            double theScore = keyboard.nextDouble();
            while (theScore<0 || theScore >100)
            {
                System.out.print("Invalid Entry.");
                System.out.print("Please enter the score for student 3 on test "+(i+1)+": ");
                theScore = keyboard.nextDouble();
                
            }
            newBook.setTestScores3(i, theScore);
        }
        System.out.println();
        for (int i = 0; i<4 ;i++)
        {
            
            System.out.print("Please enter the score for student 4 on test "+(i+1)+": ");
            double theScore = keyboard.nextDouble();
            while (theScore<0 || theScore >100)
            {
                System.out.print("Invalid Entry.");
                System.out.print("Please enter the score for student 4on test "+(i+1)+": ");
                theScore = keyboard.nextDouble();
                
            }
            newBook.setTestScores4(i, theScore);
        }
        System.out.println();
        for (int i = 0; i<4 ;i++)
        {
            
            System.out.print("Please enter the score for student 5 on test "+(i+1)+": ");
            double theScore = keyboard.nextDouble();
            newBook.setTestScores5(i, theScore);
            while (theScore<0 || theScore >100)
            {
                System.out.print("Invalid Entry.");
                System.out.print("Please enter the score for student 4on test "+(i+1)+": ");
                theScore = keyboard.nextDouble();
                
            }
            newBook.setTestScores5(i, theScore);
        }


        for (int  i =0; i < 5;i++)
        {
            names[i] = newBook.getName(i);
        }
        for (int i = 0; i<4 ;i++)
        {
           TestScores1[i] = newBook.getTestScore1(i);
        }
        for (int i = 0; i<4 ;i++)
        {
           TestScores2[i] = newBook.getTestScore2(i);
        }
        for (int i = 0; i<4 ;i++)
        {
           TestScores3[i] = newBook.getTestScore3(i);
        }
        for (int i = 0; i<4 ;i++)
        {
           TestScores4[i] = newBook.getTestScore4(i);
        }
        for (int i = 0; i<4 ;i++)
        {
           TestScores5[i] = newBook.getTestScore5(i);
        }

        double AverageStud1 = newBook.getaverageScore(TestScores1);
        double AverageStud2 = newBook.getaverageScore(TestScores2);
        double AverageStud3 = newBook.getaverageScore(TestScores3);
        double AverageStud4 = newBook.getaverageScore(TestScores4);
        double AverageStud5 = newBook.getaverageScore(TestScores5);


        char letterGradestud1 = newBook.getgradeScore(TestScores1);
        char letterGradestud2 = newBook.getgradeScore(TestScores2);
        char letterGradestud3 = newBook.getgradeScore(TestScores3);
        char letterGradestud4 = newBook.getgradeScore(TestScores4);
        char letterGradestud5 = newBook.getgradeScore(TestScores5);


        grades[0] = letterGradestud1;
        grades[1] = letterGradestud2;
        grades[2] = letterGradestud3;
        grades[3] = letterGradestud4;
        grades[4] = letterGradestud5;


        System.out.println();
        System.out.printf("The average score of student 1 is: %,.2f\n",AverageStud1);
        System.out.printf("The average score of student 2 is: %,.2f\n",AverageStud2);
        System.out.printf("The average score of student 3 is: %,.2f\n",AverageStud3);
        System.out.printf("The average score of student 4 is: %,.2f\n",AverageStud4);
        System.out.printf("The average score of student 5 is: %,.2f\n",AverageStud5);

        System.out.println();
        System.out.println("The grade of "  + names[0] +" is: "+ letterGradestud1);
        System.out.println("The grade of"  + names[1] +" is: "+ letterGradestud2);
        System.out.println("The grade of"  + names[2] +" is: "+ letterGradestud3);
        System.out.println("The grade of "  + names[3] +" is: "+ letterGradestud4);
        System.out.println("The grade of "  + names[4] +" is: "+ letterGradestud5);
    }       
}