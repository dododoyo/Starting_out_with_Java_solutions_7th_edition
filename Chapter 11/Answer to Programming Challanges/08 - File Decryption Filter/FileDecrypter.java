import java.io.*;
public class FileDecrypter 
{
    // This code is not finished
    public static void main(String[] args)throws IOException
    {
        boolean eof = false;
       
    try
        {
            String importantMessage = null;
            //System.out.println(importantMessage);
            while(!eof)
            {
            decrypt("EncryptedFile.dat");
            DataInputStream reader = new DataInputStream(new FileInputStream("DecryptedFile.dat"));
            
            System.out.println(importantMessage);
            importantMessage = reader.readUTF();//not reading the file here
            System.out.println(importantMessage);
            reader.close();
            }
            importantMessage = "hi";
            System.out.println(importantMessage);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("The file specified was not found.");
        }
        catch(EOFException e)
        {
            eof = true;
        }
        catch(IOException e)
        {
            System.out.println("Some IOException occured.");
        }
        
    }

    public static void decrypt(String fileName)
    {
        boolean eof = false;
        try
        {
            RandomAccessFile oldFile = new RandomAccessFile(fileName,"r");
            RandomAccessFile newFile = new RandomAccessFile("DecryptedFile.dat","rw");

            int ascii;
            long position = 0;
            char eachCharacter;
            
            while(!eof)
            {
                oldFile.seek(position);
                eachCharacter = oldFile.readChar();
                ascii = eachCharacter-2;
                newFile.writeChar(ascii);
                position += 2;
            }
            newFile.close();
            oldFile.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("The file specified was not found.");
        }
        catch(EOFException e)
        {
            eof = true;
        }
        catch(IOException e)
        {
            System.out.println(e.getStackTrace());
        }
        /*finally
        {
            System.out.println("A new encrytped file has been created with a name 'DecryptedFile.dat'");
        }*/
    }
    
}
