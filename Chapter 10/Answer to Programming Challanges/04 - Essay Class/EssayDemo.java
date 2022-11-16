import java.util.Scanner;
public class EssayDemo 
{
    public static void main(String[] args)
    {
        Essay paper = new Essay();
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter your marks for grammar on your essay: ");
        paper.setGrammerPoints(kb.nextDouble());
        System.out.print("Please enter your marks for the Spelling portions: ");
        paper.setSpellingPoints(kb.nextDouble());
        System.out.print("Please enter your marks for the length of your essay: ");
        paper.setLengthPoints(kb.nextDouble());
        System.out.print("Please enter mark of your essay for its contents: ");
        paper.setContentPoints(kb.nextDouble());
        paper.setScores();

        System.out.println();
        System.out.println();
        System.out.println("Your points for the grammar of your essay is: "+ paper.getGrammarPoints());
        System.out.println("Your points for the spelling of your essay is: "+paper.getSpellinPoint());
        System.out.println("Your points for the correct length of your essay is: "+paper.getLengthPoint());
        System.out.println("Your points for the content of your essay is: "+paper.getContentPoints());
        System.out.println("The total points you got for your essay is :"+paper.getScore());
        System.out.println("Your grade for your essay is: " +paper.getGrade());
        
    }
    
}
