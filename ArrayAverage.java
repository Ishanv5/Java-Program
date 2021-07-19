// Average of Array Element 
import java.util.Scanner;
class ArrayAverage {
    public static void main(String[] args) {
        int a[]=new int[5]; int sum=0;double avg;
        Scanner r=new Scanner(System.in);
        System.out.print(" Enter element of array ");
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print(" Array element ");
        for(int i=0;i<a.length;i++)
        {
             System.out.print(a[i] + " ");
             sum=sum+a[i];
        }
        System.out.print(" Addition " + sum);
        avg=sum/5;
        System.out.print(" Average of Array element " + avg);
    }
}
