// Read Data from file 
import java.io.*;
class fileReader
{
    public static void main(String[] args)  {
        try
        {
       FileInputStream b=new FileInputStream("C:\\Users\\ishan\\Desktop\\filehandling\\I.txt ");
        try
        {
            int i;
            while((i=b.read())!=-1)
            {
                System.out.println((char)i);
            }
        }
        finally
        {
            b.close();
        }
        }
        catch(IOException e)
        {
                 System.out.println(" Exception Handled.... ");
        }

    }
}