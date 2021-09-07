// Matrix Program using 2D Array
import java.util.Scanner;
class Matrix2DArray {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.print(" Enter array element ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                  a[i][j]=r.nextInt();
            }
        }
        System.out.print(" Matrix : \n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                  System.out.print(a[i][j] + " ");
            }
            System.out.print(" \n");
        }
    }
}
