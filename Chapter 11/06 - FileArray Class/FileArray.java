import java.io.*;
public class FileArray 
{
    public static void writeArray(String fileName, int[] arrayName)   
    {
        try
        {

            DataOutputStream scanner = new DataOutputStream(new FileOutputStream(fileName));
            for(int val:arrayName)
            scanner.writeInt(val);
            scanner.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("The file specified was not found.");
        }
        catch(IOException e)
        {
            System.out.println("An IOException occured. ");
        }

    }

    public static void readArray(String fileName, int[] arrayName)
    {
        try
        {
            DataInputStream scanner = new DataInputStream(new FileInputStream(fileName));
            for (int i = 0 ; i < arrayName.length;i++)
            {
                arrayName[i] = scanner.readInt();
            }
            scanner.close();
        }
        catch(EOFException e)
        {
            System.exit(0);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("The file specified was not found.");
        }
        catch(IOException e)
        {
            System.out.println("An IOException occured. ");
        }
    }
    
}
