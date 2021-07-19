import java.util.Scanner;
class ArrayAdd {
    public static void main(String[] args) {
        int a[]=new int[5]; int sum=0;
        Scanner r=new Scanner(System.in);
        System.out.print(" Enter element in array ");
        for(int i=0;i<a.length;i++)
        {
              a[i]=r.nextInt();
        }
         System.out.print(" Array Elemet ");
         for(int i=0;i<a.length;i++)
        {
              System.out.print(a[i] + " ");
              sum=a[i]+sum;
        }
        System.out.print(" \n Addition of array elemnt " + sum);
    }
}
