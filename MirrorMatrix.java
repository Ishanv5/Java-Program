// Mirror Matrix 
import java.util.Scanner;
class MirrorMatrix {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        Scanner r=new Scanner(System.in);
        System.out.print(" Enter Array Data ");
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=1;j++)
            {
                 a[i][j]=r.nextInt();
            }
        }
        System.out.print(" Array Matrix \n ");
        for(int i=0;i<=1;i++)
        {
            for(int j=0;j<=1;j++)
            {
                 System.out.print(a[i][j]+ " ");
            }
        }
        System.out.print(" Mirror  Matrix \n ");
        for(int i=1;i>=0;i--)
        {
            for(int j=0;j<=1;j++)
            {
                 System.out.print(a[i][j]+ " ");
            }
        }
    }
}
