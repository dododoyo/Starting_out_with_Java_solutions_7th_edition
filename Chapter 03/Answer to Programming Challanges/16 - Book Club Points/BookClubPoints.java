import java.util.Scanner;
public class BookClubPoints 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int books;
        int points;
        System.out.print("Please enter the number of books purchased this month: ");
        books = keyboard.nextInt();
        if (books == 0)
        {
            points = 0;
        }
        else if (books == 1)
        {
            points = 5;
        }
        else if (books == 2)
        {
            points = 15;
        }
        else if (books == 3)
        {
            points = 30;
        }
        else if (books >= 4)
        {
            points = 60;
        }
        else 
        {
            points = 0;
            System.out.println("Invalid input");
        }
        System.out.println("The number of points awarded this month is: "+points);

    }
    
}
