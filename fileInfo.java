// File Information 
import java.io.File;
class fileInfo
{
    public static void main(String[] args) {
        File f=new File("C:\\Users\\ishan\\Desktop\\java programing\\LC.txt ");
        if(f.exists())
        {
            System.out.println("File name "+f.getName());
            System.out.println("File Location "+f.getAbsolutePath());
            System.out.println("File Writable "+f.canWrite());
            System.out.println("File Readable  "+f.canRead());
            System.out.println("File size "+f.length());
            System.out.println("File Remove  "+f.delete());
        }
        else
        {
            System.out.println("File not Found  ");
        }
    }
}