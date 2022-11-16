import java.util.Scanner;
public class Telemarketing
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        // Sample name List
        String[] nameList = {"Harrison, Rose", "James, Jean", "Smith, William", "Smith, Brad"};
        // Sample phone List
        String[] phoneList = {"555-2234","555-9098","555-1785","555-9224"};
        int index = 0;
        System.out.print("Please enter the first letters of the name you want to look at: ");
        String theName = keyboard.nextLine();
        int j =0;
    
        for (String name: nameList)
        {
            if (name.startsWith(theName))
            {
                index = j;
                break;
            }
            j++;
        }
        System.out.println("The full name of the person is: "+ nameList[index]);
        System.out.println("The phonenumber of the person is: "+ phoneList[index]);

    }
}