// Console class
import java.io.*;;
class ConsoleClass {
    public static void main(String[] args) {
        String str;
        char ch[];
       Console obj=System.console(); 
          System.out.println(" Enter Username ");
          str=obj.readLine();
          System.out.println(" Enter Passcode ");
          ch=obj.readPassword();
          System.out.println(" Username "+ str);
          System.out.println(" Passcode "+ ch);
    }
}
