import java.util.Scanner;
public class SortedNames 
{
    public static void main(String[] args)
    {
        String name1,name2,name3;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the name of the first person: ");
        name1 = keyboard.nextLine();
        System.out.print("Please enter the name of the second person: ");
        name2 = keyboard.nextLine();
        System.out.print("Please enter the name of the third person: ");
        name3 = keyboard.nextLine();
        if (name1.compareTo(name2) < 0 && name1.compareTo(name3) < 0)
        {
            System.out.println("\n"+name1+"\n");
            if (name3.compareTo(name2)<0)
            {
                System.out.println(name3+"\n");
                System.out.println(name2+"\n");
            }
            else 
            {
                System.out.println(name2+"\n");
                System.out.println(name3+"\n");

            }
        }
        else if ( name3.compareTo(name1) < 0 && name3.compareTo(name2) < 0 )
        {
            System.out.println(name3+"\n");
            if (name1.compareTo(name2)<0)
            {
                System.out.println(name1+"\n");
                System.out.println(name2+"\n");
            }
            else 
            {
                System.out.println(name2+"\n");
                System.out.println(name1+"\n");

            }
        }
        else if (name2.compareTo(name1) < 0 && name2.compareTo(name3) < 0)
        {
            System.out.println(name2+"\n");
            if (name1.compareTo(name3)<0)
            {
                System.out.println(name1+"\n");
                System.out.println(name3+"\n");
            }
            else 
            {
                System.out.println(name3+"\n");
                System.out.println(name1+"\n");
            }
        }
    }
    
}
