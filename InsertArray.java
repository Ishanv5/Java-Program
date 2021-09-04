//Insert Array item
import java.util.Scanner; 
class InsertArray {
    public static void main(String[] args) {
        int size,loc,item,i;
        Scanner r=new Scanner(System.in);
        System.out.print(" Enter  Array Size ");
        size=r.nextInt();
        int a[]=new int[size+1];
        System.out.print(" Enter  Array  elements  : ");
        for(i=0;i<size;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print(" Enter Array location : ");
        loc=r.nextInt();
        System.out.print(" Enter  new item : ");
        item=r.nextInt();
        for(i=size;i>loc;i--)
        {
            a[i]=a[i-1];
        }
        a[loc]=item;
        size++;
        for(i=0;i<size;i++)
        {
          System.out.print(a[i] + " ");
        }
    }
}
