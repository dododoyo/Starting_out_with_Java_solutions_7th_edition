import java.util.Scanner;
public class TestAverage 

{
    public static void main(String[] args)
    {
        double test1;
        int test2;
        int test3;
        double testAverage;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your scores for test 1: ");
        test1 = keyboard.nextDouble();
        System.out.print("Please enter your scores for test 2: ");
        test2 = keyboard.nextInt();
        System.out.print("Please enter your scores for test 3: ");
        test3 = keyboard.nextInt();
        testAverage = (test1+test2+test3)/3;
        System.out.println("Average of the test scores is: "+ testAverage);

    }    
}
