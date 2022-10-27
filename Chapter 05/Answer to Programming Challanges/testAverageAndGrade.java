import java.util.Scanner;
public class testAverageAndGrade 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); 
        System.out.print("Please enter you score from test 1: ");
        int test1 = keyboard.nextInt();
        System.out.print("Please enter you score from test 2: ");
        int test2 = keyboard.nextInt();
        System.out.print("Please enter you score from test 3: ");
        int test3 = keyboard.nextInt();
        System.out.print("Please enter you score from test 4: ");
        int test4 = keyboard.nextInt();
        System.out.print("Please enter you score from test 5: ");
        int test5 = keyboard.nextInt();
        double average = calcAverage(test1, test2, test3, test4, test5);
        char grade = determineGrade(average);
        if (grade == 'X')
        System.out.println("\nInvalid input was detected, Please restart the program.\n");
        else
        {
            System.out.printf("\nAverage of the test scores is: %,.2f\n", average);
            System.out.println("The grade of the average test score is: "+grade);
        }
    }


    public static double calcAverage(double test1, double test2, double test3, double test4, double test5 )
    {
        double totalTest = test1 + test2 + test3 + test4 + test5;
        return totalTest/5;
    }


    public static char determineGrade(double theTestScore)
    {
        char grade ;
        if (theTestScore>=90 && theTestScore <=100)
        grade = 'A';
        else if (theTestScore>=80 && theTestScore <=89)
        grade = 'B';
        else if (theTestScore>=70 && theTestScore <=79)
        grade = 'C';
        else if (theTestScore>=60 && theTestScore <=69)
        grade = 'D';
        else if (theTestScore < 60&& theTestScore>0)
        grade = 'F';
        else 
        grade = 'X';
        return grade;
    }
    
}

