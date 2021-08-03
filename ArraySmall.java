// Find the Smallest Array in the element 
import java.util.Scanner;
class ArraySmall {
    public static void main(String[] args) {
        int a[]=new int[5]; int min;
        Scanner r=new Scanner(System.in);
        System.out.print(" Enter array in element ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        min=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.print(" Smallest Element " + min);
    }
}
