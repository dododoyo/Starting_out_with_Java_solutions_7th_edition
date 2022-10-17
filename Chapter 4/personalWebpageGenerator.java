import java.util.Scanner;
import java.io.*;
public class personalWebpageGenerator 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
        System.out.println("Now, enter a description about your self:");
        System.out.println("\n An example can be this one: ");
        System.out.println("I am a computer science major, a"
                            +"member of the Jazz club, and I hope to \nwork as a mobile"
                                + " app developer after I graduate.");
        System.out.print("Please enter your description here: ");
        String description = keyboard.nextLine();
        PrintWriter outputfile = new PrintWriter("personalWebpage.html");
        outputfile.println("<html> ");
        outputfile.println("<head>");
        outputfile.println("</head>");
        outputfile.println("<body> ");
        outputfile.println("   <center>");
        outputfile.println("       <h1>"+name+"</h1>");
        outputfile.println("   </center>");
        outputfile.println("   <hr />");
        outputfile.println("   "+ description);
        outputfile.println("   <hr /> ");
        outputfile.println("</body>");
        outputfile.println("</html>");
        outputfile.close();
    }
}
