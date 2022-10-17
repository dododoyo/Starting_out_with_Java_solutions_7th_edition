import java.util.Scanner;
public class LetterCounter 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int counter=0,index=0,length;
        String letter,letter2;
        char ch;
        System.out.print("Please enter the word:");
        letter = keyboard.nextLine();
        System.out.print("Please enter the letter you are looking for:");
        letter2 = keyboard.nextLine();
        ch = letter2.charAt(0);
        length = letter.length();
        while (index<length)
        {
            if ((letter.charAt(index))==ch)
            {
                counter++; 
            }
            index++;
        }
        System.out.println("The letter '"+ch+"' apear "+counter+" times in the word "+letter);
    }
}
