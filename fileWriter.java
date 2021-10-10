// Write on a File
import java.io.*; 
class fileWriter
{
    public static void main(String[] args) {
        try
        {
            PrintWriter f=new PrintWriter("C:\\Users\\ishan\\Desktop\\filehandling\\I.txt ");
            try
            {
                f.write(" Learn coding with Ishan ...");
            }
            finally
            {
                f.close();
            }
            System.out.println(" Successfully data wrote in file ");
        }
        catch(IOException i)
        {
            System.out.println(i);   
        }
    }
}