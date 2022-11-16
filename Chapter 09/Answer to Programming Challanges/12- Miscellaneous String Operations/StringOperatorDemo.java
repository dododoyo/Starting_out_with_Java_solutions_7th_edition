import java.util.Scanner;
public class StringOperatorDemo 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("These are the list of operations.");
        System.out.println("---------------------------------");
        System.out.println("1: Count the words.");
        System.out.println("2: Convert character array to string.");
        System.out.println("3: Get the most frequent character within a word.");
        System.out.println("4: Replace part of setence by another word.");
        System.out.print("Please select the operation you want to perform by number: ");
        int choice = keyboard.nextInt();

        if (choice == 1)
        {
            System.out.print("Please enter the sentence: ");
            keyboard.nextLine();
            String Original = keyboard.nextLine();
            int words = StringOperator.WORDCOUNT(Original);
            System.out.println("There are "+words+" words in the sentence.");
        }
        else if (choice == 2)
        {
            System.out.println("Here you have to enter each element of the array: ");
            System.out.print("Please enter array size: ");
            int arraySize = keyboard.nextInt();
            char[] charArray = new char[arraySize];
            keyboard.nextLine();
            for (int i = 0 ; i < arraySize;i++)
            {
                System.out.print("Please enter value at index "+ i +" then hit enter: ");
                String theCharacter = keyboard.nextLine();
                char realChar = theCharacter.charAt(0);
                charArray[i] = realChar;
            }
            String theSentence = String.valueOf(charArray);
            System.out.print("The string is: ");
            System.out.println(theSentence);
        }
        else if (choice == 3)
        {
            System.out.print("Please enter the string you want to check: ");
            keyboard.nextLine();
            String theString = keyboard.nextLine();
            char frequent = StringOperator.MOSTFREQUENT(theString);
            System.out.println("The most frequent character in your string is: "+ frequent);
        }
        
        else if (choice == 4)
        {
            keyboard.nextLine();
            System.out.print("\nPlease enter the sentence: ");
            String Original = keyboard.nextLine();
            System.out.print("Please enter the word to be replaced: ");
            String replaced = keyboard.nextLine();
            System.out.print("Please enter the word to be replaced with: ");
            String replacer = keyboard.nextLine();
            String Modified = StringOperator.REPLACESUBSTRING(Original, replaced, replacer);
            System.out.println("\nThe modified string will be.");
            System.out.println(Modified);
        }
        else
        {
            System.out.println("Invalid Entry, Please restart the program.");
        }   
    }
    
}
