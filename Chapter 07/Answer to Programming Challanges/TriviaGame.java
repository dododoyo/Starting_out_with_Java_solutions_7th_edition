import java.util.Scanner;
import java.util.ArrayList;
public class TriviaGame 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Question> theQuestions = new ArrayList<Question>();
        Question question1 = new Question("Physical devices a computer is made of are called: ", "Hardware", "software", "operating system", "tools", 1);
        Question question2 = new Question("Part of a computer that runs a program is called: ", "RAM", "CPU", "Secondary Storage", "Main memory", 2);
        Question question3 = new Question("Today, CPUs are small chips known as: ", "ENIACs", "Microprocessors", "Memory chips", "Operating systems", 2);
        Question question4 = new Question("A video display is an ________ device: ", "input", "output", "secondary storage", "main memory", 1);
        Question question5 = new Question("A byte is made up of _______ bits: ", "4", "12", "16", "8", 4);
        Question question6 = new Question("Bit that is turned off represents______: ", "1", "-1", "0", "no", 3);
        Question question7 = new Question("Real numbers are encoded using the _________ technique: ", "two\"s complement", "unicode", "ASCII", "floating point", 4);
        Question question8 = new Question("Negative numbers are encoded using the _________ technique: ", "two\"s complement", "unicode", "ASCII", "floating point", 1);
        Question question9 = new Question("Computers can only execute programs that are written in ________. ", "Java", "Python", "Machine Language", "Assembly Language", 3);
        Question question10 = new Question("The rules that must be followed when writting a program are called: ", "syntax", "punctuation", "grammar", "key-word", 1);
        theQuestions.add(question1);
        theQuestions.add(question2);
        theQuestions.add(question3);
        theQuestions.add(question4);
        theQuestions.add(question5);
        theQuestions.add(question6);
        theQuestions.add(question7);
        theQuestions.add(question8);
        theQuestions.add(question9);
        theQuestions.add(question10);
        
        int Player1Score=0;
        int Player2Score=0;
        int response;

        for (int i =0;i<10;i++){
            if (i%2 == 0){
                System.out.println("\nThis is a question for player 1.\n");
                System.out.println(theQuestions.get(i).thequestion);
                System.out.println("Choices are: ");
                System.out.println("1: "+theQuestions.get(i).ans1);
                System.out.println("2: "+theQuestions.get(i).ans2);
                System.out.println("3: "+theQuestions.get(i).ans3);
                System.out.println("4: "+theQuestions.get(i).ans4);
                System.out.print("Please type in the number of the correct answer: ");
                response = keyboard.nextInt();
                if (response == theQuestions.get(i).getCorrectAns())
                Player1Score++;
            }
            else
            {
            System.out.println("\nThis is a question for player 2.\n");
                System.out.println(theQuestions.get(i).thequestion);
                System.out.println("Choices are: ");
                System.out.println("1: "+theQuestions.get(i).ans1);
                System.out.println("2: "+theQuestions.get(i).ans2);
                System.out.println("3: "+theQuestions.get(i).ans3);
                System.out.println("4: "+theQuestions.get(i).ans4);
                System.out.print("Please type in the number of the correct answer: ");
                response = keyboard.nextInt();
                if (response == theQuestions.get(i).getCorrectAns())
                Player2Score++;
            }
        }
        System.out.println();
        if (Player1Score>Player2Score)
        {
            System.out.println("Player 1 answered "+ Player1Score+" out of 5 questions.");
            System.out.println("Player 2 answered "+ Player2Score+" out of 5 questions.");
            System.out.println("--------------------------------------------------------");
            System.out.println("Player 1 won this game.");
        }
        else if (Player1Score<Player2Score)
        {
            System.out.println("Player 1 answered "+ Player1Score+" out of 5 questions.");
            System.out.println("Player 2 answered "+ Player2Score+" out of 5 questions.");
            System.out.println("--------------------------------------------------------");
            System.out.println("Player 2 won this game.");
        }
        else if (Player1Score==Player2Score)
        {
            System.out.println("Player 1 answered "+ Player1Score+" out of 5 questions.");
            System.out.println("Player 2 answered "+ Player2Score+" out of 5 questions.");
            System.out.println("--------------------------------------------------------");
            System.out.println("This game was a draw.");
        }
    }
}
