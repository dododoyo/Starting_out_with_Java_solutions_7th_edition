import java.util.Scanner;
public class TestScoresGrade 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int test1,test2,test3;
        double total,average;
        System.out.print("Please enter your scores from test 1: ");
        test1 = keyboard.nextInt();
        System.out.print("Please enter your scores from test 2: ");
        test2 = keyboard.nextInt();
        System.out.print("Please enter your scores from test 3: ");
        test3 = keyboard.nextInt();
        total = test1 + test2 + test3;
        average = total/3;
        System.out.printf("Your average score is: %,.2f\n",average);
        if (average <=100 && average >= 90)
        {
            System.out.println("You have a grade of 'A' ");
        }
        else if (average <=89 && average >= 80)
        {
            System.out.println("You have a grade of 'B' ");
        }
        else if (average <=79 && average >= 70)
        {
            System.out.println("You have a grade of 'C' ");
        }
        else if (average <=69 && average >= 60)
        {
            System.out.println("You have a grade of 'D' ");
        }
        else if (average < 60 && average >= 0)
        {
            System.out.println("You have a grade of 'F' ");
        }
        else 
        {
            System.out.println("Invalid Score: ");
        }

    }
    
}
