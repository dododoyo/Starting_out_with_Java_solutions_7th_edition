import java.util.Scanner;
import java.util.Random;
public class slotMachine 
{
    public static void main(String[] args)
    {
        String response;
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        do
        {
            System.out.print("Please enter the amount of money you want to bet on: ");
            double money = keyboard.nextDouble();
            double moneyWon = 0;
            String fruit1,fruit2, fruit3;
        
            int randomNumber = rand.nextInt(6);
            if (randomNumber == 0)
            fruit1 = "Cherries";
            else if (randomNumber == 1)
            fruit1 = "Oranges";
            else if (randomNumber == 2)
            fruit1 = "Plums";
            else if (randomNumber == 3)
            fruit1 = "Bells";
            else if (randomNumber == 4)
            fruit1 = "Melons";
            else
            fruit1 = "Bars";

            randomNumber = rand.nextInt(6);
            if (randomNumber == 0)
            fruit2 = "Cherries";
            else if (randomNumber == 1)
            fruit2 = "Oranges";
            else if (randomNumber == 2)
            fruit2 = "Plums";
            else if (randomNumber == 3)
            fruit2 = "Bells";
            else if (randomNumber == 4)
            fruit2 = "Melons";
            else
            fruit2 = "Bars";

            randomNumber = rand.nextInt(6);
            if (randomNumber == 0)
            fruit3 = "Cherries";
            else if (randomNumber == 1)
            fruit3 = "Oranges";
            else if (randomNumber == 2)
            fruit3 = "Plums";
            else if (randomNumber == 3)
            fruit3 = "Bells";
            else if (randomNumber == 4)
            fruit3 = "Melons";
            else
            fruit3 = "Bars";

            if (fruit1.equals(fruit2) || fruit1.equals(fruit3) || fruit3.equals(fruit2))
            moneyWon = money*2;
            else if (fruit1.equals(fruit2)&&fruit1.equals(fruit3))  
            moneyWon = money*3;
            else 
            moneyWon = 0;
            System.out.println("The result of the pull was ");
            System.out.println(fruit1+" || "+fruit2+" || "+fruit3);
            System.out.println("You have won a total money amounting to: "+moneyWon);
            System.out.print("\n Please enter 'y', or anything else if you wish to stop: ");
            keyboard.nextLine();
            response = keyboard.nextLine();
            System.out.println();

        }while (response.equals("y"));
    }
}
