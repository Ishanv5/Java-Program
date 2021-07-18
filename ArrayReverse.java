// print Array element in reverse order 
import java.util.Scanner;
class ArrayReverse {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print(" Enter element in arrays ");
       for(int i=0;i<a.length;i++)
       {
           a[i]=r.nextInt();
       }
       System.out.print(" Array Element ");
       for(int i=0;i<a.length;i++)
       {
           System.out.print(a[i] + " ");
       }
       System.out.print("\n Array Reverse Element ");
       for(int i=a.length-1;i>=0;i--)
       {
           System.out.print(a[i] + " ");
       }

    }
}
