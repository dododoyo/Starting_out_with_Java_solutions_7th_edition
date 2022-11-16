import java.util.Scanner;
public class TestScoreDemo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int test1,test2,test3;
        System.out.print("Please enter test score for Test 1: ");
        test1 = keyboard.nextInt();
        System.out.print("Please enter test score for Test 2: ");
        test2 = keyboard.nextInt();
        System.out.print("Please enter test score for Test 3: ");
        test3 = keyboard.nextInt();

        TestScore Score1 = new TestScore(test1,test2,test3);
        System.out.printf("\nThe average of the test scores is: %,.2f\n", Score1.getAverageScore());

    }
    
}
