// Create a file 
import java.io.*;
class createFile 
{
    public static void main(String[] args) {
        File f=new File("C:\\Users\\ishan\\Desktop\\java programing\\LC.txt ");
        try
        {
            if(f.createNewFile())  
            {
               System.out.println(" File created ");
            }
            else
            {
                System.out.println(" File already Exist... ");
            }
        }
        catch(IOException i )
        {
             System.out.println(" Exception handled ...");
        }
        
    }
}