import java.util.Scanner;
public class MaleFemalePercentage 
{
    public static void main(String[] args)
    {
        double males;
        int females;
        double total;
        double male_percent;
        double female_percent;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter the number of males in the classroom: ");
        males = keyboard.nextDouble();
        System.out.print("Please enter the number of females in the classroom: ");
        females = keyboard.nextInt();
        total = males + females;
        male_percent = (males/total)*100;
        female_percent = (females/total)*100;
        System.out.println("The percentage of female students is: "+female_percent+"%");
        System.out.println("The percentage of male students is: "+male_percent+"%");
    }
    
}
