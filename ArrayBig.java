// Find biggest element in array 
import java.util.Scanner;
class ArrayBig {
    public static void main(String[] args) {
        int a[]=new int [5]; int max;
        Scanner r=new Scanner(System.in);
        System.out.print(" Enter array element ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.print(" Maximum element " + max);
    }
}
