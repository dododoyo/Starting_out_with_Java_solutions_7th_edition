// This data encrypter only works for array of integers
import java.io.*;

public class FileEncrypter
{
    public static void main(String[] args)
    {
        try
        {
            DataOutputStream writer = new DataOutputStream(new FileOutputStream("Letters.dat"));
            writer.writeUTF("There was a girl named Alice.");
            writer.close();
            encrypt("Letters.dat");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("The file specified was not found.");
        }
        catch(IOException e)
        {
            System.out.println("Some IOException occured.");
        }
        
    }
    public static void encrypt(String fileName)
    {
        try
        {
            RandomAccessFile oldFile = new RandomAccessFile(fileName,"r");
            RandomAccessFile newFile = new RandomAccessFile("EncryptedFile.dat","rw");
            int ascii;
            long position = 0;
            char eachCharacter;

            while(true)
            {
                oldFile.seek(position);
                eachCharacter = oldFile.readChar();
                ascii = eachCharacter+2;
                newFile.writeChar(ascii);
                position += 2;
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("The file specified was not found.");
        }
        catch(EOFException e)
        {
            System.exit(0);
        }
        catch(IOException e)
        {
            System.out.println("An IOException occured.");
        }
        finally
        {
            System.out.println("A new encrytped file has been created with a name 'EncryptedFile.dat'");
        }

    }
}