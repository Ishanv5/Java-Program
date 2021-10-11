// Packages 
import java.io.*;
import java.util.Scanner;
class packages
{
    public static void main(String[] args) {
        try
        {
            File r=new File("C:\\Users\\ishan\\Desktop\\java programing\\LC.txt ");
            Scanner sc=new Scanner(r);
            while(sc.hasNextLine())
            {
                  System.out.println(sc.hasNextLine());
                  System.out.println(sc.nextLine());
                  System.out.println(sc.hasNextLine());
            }
        }
        catch(IOException e)
        {
            System.out.println(" Exceptiion Handled ....");
        }
    }
}