import java.util.Scanner;
class ArrayLength {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner r=new Scanner(System.in);
        System.out.print(" ENter element in array ");
        for(int i=0;i<5;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print(" Array element ");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.print(" Array length " + a.length);
    }
}
