import java.util.ArrayList;
public class PhoneBookDemo 
{
    public static void main(String[] args)
    {
        ArrayList<PhoneBookEntry> phoneBook = new ArrayList<PhoneBookEntry>();
        PhoneBookEntry contact1 = new PhoneBookEntry("Kajella",2435452);
        PhoneBookEntry contact2 = new PhoneBookEntry("Chris",5496546);
        PhoneBookEntry contact3 = new PhoneBookEntry("John",34082221);
        PhoneBookEntry contact4 = new PhoneBookEntry("Jesus",2320932);
        PhoneBookEntry contact5 = new PhoneBookEntry("Selam",13392802);


        phoneBook.add(contact1);
        phoneBook.add(contact2);
        phoneBook.add(contact3);
        phoneBook.add(contact4);
        phoneBook.add(contact5);


        for (int i = 0; i<5 ; i++)
        {
            System.out.println("\nThis is the data for contact "+(i+1));
            System.out.print("Name: ");
            System.out.println(phoneBook.get(i).getName());
            System.out.print("Number: ");
            System.out.println(phoneBook.get(i).getNumber());
            
        }
        

    }
    
}
