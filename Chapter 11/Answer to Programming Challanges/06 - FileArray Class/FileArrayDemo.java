import java.io.*;
public class FileArrayDemo 
{
    public static void main(String[] args)throws IOException
    {
        int[] newlist = {1,2,3,4,5,5,5,2,4};
        // Writting the contents of the int Array
        FileArray.writeArray("intlist.dat",newlist);
        
        int[] intArray = new int[9];
        System.out.println("This were the contents of the new array before data were read from the file.");
        for(int val:intArray)
        {
            System.out.println(val);
        }
        //Reading contents of the file 
        FileArray.readArray("intlist.dat", intArray);
        System.out.println("\n\nThis are the contents of the new array after data is read from the file.");
        for(int val:intArray) // displaying array's new elements
        {
            System.out.println(val);
        }
    }
    
}
