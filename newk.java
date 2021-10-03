// new Keyword 
import java.util.Scanner;
class newk  // Using instance variable 
{
   /* int a=100;
    newk()   // using constructor
    {
        System.out.println(a); 
    } */
    public static void main(String[] args) {
       // newk n=new newk(); 
       //  System.out.println(n.a);
       int size;
       System.out.println(" Enter array size ");
       Scanner r=new Scanner(System.in);
       size=r.nextInt();
       int a[]=new int[size];
       System.out.println(" Enter array element  ");
       for(int i=0;i<size;i++)
       {
              a[i]=r.nextInt();
       }
       System.out.println(" Array element : ");
       for(int m:a)
       {
        System.out.println(m+" ");
       }
    }
}