// Palindrome nos 
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Palindrome {
   public static void main(String [] args) {
      
    int n,s=0,r,c;
    System.out.print(" enter any nos ");
    Scanner ref=new Scanner(System.in);
    n=ref.nextInt();
    c=n;
    while(n>0)
    {
      r=n%10;
      s=(s*10)+r;
      n=n/10;

    }
    if(c==s)
    System.out.print(" Palindrome nos ");
    else
    System.out.print("  Not Palindrome nos ");
   } 
}
