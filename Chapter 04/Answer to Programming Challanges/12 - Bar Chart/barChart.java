import java.util.Scanner;
public class barChart 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double sale1,sale2,sale3,sale4,sale5;
        int bar1,bar2,bar3,bar4,bar5;
        for (int number = 1; number <6;number++);
        System.out.print("Enter today's sales for store 1 : ");
        sale1 = keyboard.nextInt();
        bar1 = (int)(sale1/100);
        System.out.print("Enter today's sales for store 2 : ");
        sale2 = keyboard.nextInt();
        bar2 = (int)(sale2/100);
        System.out.print("Enter today's sales for store 3 : ");
        sale3 = keyboard.nextInt();
        bar3 = (int)(sale3/100);
        System.out.print("Enter today's sales for store 4 : ");
        sale4 = keyboard.nextInt();
        bar4 = (int)(sale4/100);
        System.out.print("Enter today's sales for store 5 : ");
        sale5 = keyboard.nextInt();
        bar5 = (int)(sale5/100);
        System.out.println("SALES BAR CHART");

        System.out.print("Store 1: ");
        for (int bar = 1;bar<=bar1;bar++)
        {
            System.out.print("*");

        }
        System.out.println();

        System.out.print("Store 2: ");
        for (int bar = 1;bar<=bar2;bar++)
        {
            System.out.print("*");

        }
        System.out.println();

        System.out.print("Store 3: ");
        for (int bar = 1;bar<=bar3;bar++)
        {
            System.out.print("*");

        }
        System.out.println();

        System.out.print("Store 4: ");
        for (int bar = 1;bar<=bar4;bar++)
        {
            System.out.print("*");

        }
        System.out.println();

        System.out.print("Store 5: ");
        for (int bar = 1;bar<=bar5;bar++)
        {
            System.out.print("*");

        }
        System.out.println();
    }
    
}
