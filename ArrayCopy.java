// Copy Array Element 
import java.util.Scanner;
class ArrayCopy {
    public static void main(String[] args) {
       int a[]=new int[5];
       int b[]=new int[5];
       Scanner r=new Scanner(System.in);
       System.out.print(" Enter value in first array ");
       for(int i=0;i<a.length;i++) 
       {
           a[i]=r.nextInt();
       }
       System.out.print(" First array  element ");
       for(int i=0;i<a.length;i++) 
       {
           System.out.print(a[i] + " ");
       }
       System.out.print(" \n Second  array  element ");
       for(int i=0;i<a.length;i++) 
       {
        b[i]=a[i];  
        System.out.print(b[i] + " ");
       }
    }
}
