                    /* sum of even and odd */
   import java.util.Scanner;
    class Oddeven
    {
       public static void main(String[] args) {
           
           int n,i,sum=0;
           System.out.print(" Enter a nos ");
           Scanner r=new Scanner(System.in);
           n=r.nextInt();
           if(n%2==0)
           {
                for( i=0;i<=n;i=i+2)
                {
                   sum=sum+i;  
                }
                System.out.print(" Sum of even nos  " + sum);
           }
           else
           {
                for(i=1;i<=n;i=i+2)
                {
                     sum=sum+i; 
                }
             System.out.print(" Sum of odd nos  " + sum);
           }
       }
    }