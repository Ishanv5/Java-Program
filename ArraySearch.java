// Search Array Element 
import java.util.Scanner;
class ArraySearch
{
    public static void main(String[] args) {
       int a[]=new int[5]; int n,count=0;
       Scanner r=new Scanner(System.in);
       System.out.print(" Enter elemet in array "); 
       for(int i=0;i<a.length;i++)
       {
           a[i]=r.nextInt();
       }
       System.out.print(" Array element ");
       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i] + " ");
       }
       System.out.print(" \n Enter search element ");
       n=r.nextInt();
       for(int i=0;i<a.length;i++)
       {
           if(a[i]==n)
           {
               count++;
           }
       }
       if(count>0)
       System.out.print(" Item found " +count+ " times ");
       else
       System.out.print(" item not found ");
    }
}