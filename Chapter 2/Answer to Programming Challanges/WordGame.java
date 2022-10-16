import java.util.Scanner;
public class WordGame
{
    public static void main(String[] args)
    {
        String name;
        String cityName;
        int age;
        String collageName;
        String profession;
        String animal;
        String petName;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name here: ");
        name = keyboard.nextLine();
        System.out.print("Please enter your age here: ");
        age = keyboard.nextInt();
        System.out.print("Next enter name of your city here: ");
        keyboard.nextLine();
        cityName = keyboard.nextLine();
        System.out.print("Please enter your name of your collage here: ");
        collageName = keyboard.nextLine();
        System.out.print("Please enter your profession here: ");
        profession = keyboard.nextLine();
        System.out.print("Enter your name of your favourite animal here: ");
        animal = keyboard.nextLine();
        System.out.print("Please enter your pet name here: ");
        petName = keyboard.nextLine();
        System.out.println("\t\t"+name+"'s Story.");
        System.out.println("There once was a person named "+name+ " who lived in "+cityName+". At the "+
        "\nage of " +age+", "+name+" went to college at "+collageName+"."+name+
        " \ngraduated and went to work as a "+profession+". Then, "+name+" adopted a(n) "+
        "\n"+animal+" named "+petName+". They both lived happily ever after! ");
    }
}