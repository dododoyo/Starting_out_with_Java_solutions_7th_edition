import java.util.Scanner;
public class CourseGradeDemo 
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        CourseGrade grades = new CourseGrade();

        GradedActivity Labresult = new GradedActivity();
        FinalExam Finalresult= new FinalExam();
        Essay Essayresult = new Essay();
        PassFailExam PassFailresult = new PassFailExam();

        System.out.print("Please enter your score for the Lab Activity: ");
        Labresult.setScore(kb.nextDouble());
        System.out.print("Please enter your score for the Pass Fail Exam: ");
        PassFailresult.setScore(kb.nextDouble());
        System.out.print("Please enter your score for the Essay: ");
        Essayresult.setScore(kb.nextDouble());
        System.out.print("Please enter your score for the Final Exam: ");
        Finalresult.setScore(kb.nextDouble());

        grades.setEssay(Essayresult);
        grades.setFinalExam(Finalresult);
        grades.setLab(Labresult);
        grades.setPassFailExam(PassFailresult);
        
        System.out.println();
        System.out.println(grades.toString());   
    }  
}
