// Sort array element in descending order
import java.util.Scanner;
class ArrayDescending {
   public static void main(String[] args) {
       int a[]=new int[5]; int temp;
       Scanner r=new Scanner(System.in);
       System.out.print(" Enter array element ");
       for(int i=0;i<a.length;i++)
       {
           a[i]=r.nextInt();
       }
       for(int i=0;i<a.length;i++)
       {
           for(int j=i+i;j<a.length;j++)
           {
              if(a[i]<a[j])
              {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              }
           }
       }
       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i] + " ");
       }
   } 
}
