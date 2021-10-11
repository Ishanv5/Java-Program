// Read Data from file 
import java.io.*;
class fileReader
{
    public static void main(String[] args)  {
        try
        {
        FileReader r=new FileReader("C:\\Users\\ishan\\Desktop\\filehandling\\I.txt ");
        try
        {
            int i;
            while((i=r.read())!=-1)
            {
                System.out.println((char)i);
            }
        }
        finally
        {
            r.close();
        }
        }
        catch(IOException e)
        {
                 System.out.println(" Exception Handled.... ");
        }

    }
}