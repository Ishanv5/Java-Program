// Delete Array item
import java.util.Scanner;
class DeleteArray {
    public static void main(String[] args) {
        int size,loc,item,i;
        Scanner r=new Scanner(System.in);
        System.out.print(" Enter  Array Size ");
        size=r.nextInt();
        int a[]=new int[size];
        System.out.print(" Enter  Array  elements  : ");
        for(i=0;i<size;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print(" Enter Array location : ");
        loc=r.nextInt();
        for(i=loc;i<size-1;i++)
        {
            a[i]=a[i+1];
        }
        size--;
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+ " ");
        }
    }
}
