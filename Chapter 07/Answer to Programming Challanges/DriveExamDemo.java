import java.util.Scanner;
public class DriveExamDemo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        DriveExam checker = new DriveExam();
        char[] studentAnswers = new char[20];
      // char[] studentAnswers = {'B','D',' ','C','A','A','C','A',' ','D',
      //'A','C','D','A','D','C','C','D','A','A'};
         for (int i = 0; i<20 ; i++)
        {
           
            System.out.print("Please enter the answer of the student for question "+(i+1)+" :" );
            String answer = keyboard.nextLine().toUpperCase();
            char answeR = answer.charAt(0);
            while (answeR !='A' && answeR!='B' && answeR!='C' && answeR!='D')
            {
                System.out.println("Invalid Entry. " );
                System.out.print("Please enter the answer for question "+(i+1)+" :" );
                answer = keyboard.nextLine().toUpperCase();
                answeR = answer.charAt(0);
            }
            studentAnswers[i] = answeR;
        }
        boolean passedOrFail = checker.passed(studentAnswers);
        int totalCorrect = checker.totalCorrect(studentAnswers);
        int totalIncorrect = checker.totalIncorrect(studentAnswers);
        int[] missed = checker.questionsMissed(studentAnswers);
        System.out.println("\nThe total number of questions answered correctly is: "+totalCorrect);
        System.out.println("The total number of questions not answered correctly is: "+totalIncorrect);
        if (passedOrFail)
        System.out.println("The student passed the exam.");
        else
        System.out.println("The student didnot passed the exam.");
        if (missed.length > 0)
        {
        System.out.println("Here is the set of questions missed by the student.");
        for (int val:missed)
        System.out.println(val);
        }

    }
}
