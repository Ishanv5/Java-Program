// Perfect nos 
import java.util.Scanner;
class Perfect {
   public static void main(String[] args) {
       int n,sum=0;
       System.out.print(" Enter any nos ");
       Scanner r=new Scanner(System.in);
       n=r.nextInt();
       for(int i=1;i<n;i++)
       {
          if(n%i==0)
          {
              sum=sum+i;
          }
       }
       if(n==sum)
       System.out.print(" Perfect nos ");
       else
       System.out.print(" Not Perfect nos ");
   } 
}
