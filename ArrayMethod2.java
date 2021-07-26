/* Sort() method / Equals() method /copyOf() method */
import java.util.Scanner;
import java.util.Arrays;
class ArrayMethod2 {
    public static void main(String[] args) {
        int a[]=new int[5];
        
        Scanner r=new Scanner(System.in);
        System.out.print(" Enter data in array ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        int a2[]=Arrays.copyOf(a,5);
        System.out.print(" Data of array2 ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a2[i] + " ");
        }
         /*Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] + " ");
        } */
      /*  System.out.print(" Enter data in array2 ");
        for(int i=0;i<a2.length;i++)
        {
            a2[i]=r.nextInt();
        }
        boolean b=Arrays.equals(a,a2);
        System.out.print(" Both  Arrays are equal " +b); */
    }

}
