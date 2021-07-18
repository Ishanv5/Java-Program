// Prime nos between two nos 
import java.util.Scanner;
class Prime2 {
    public static void main(String[] args) {
        
        int n1,n2,j,i;
        System.out.print(" Enter two nos ");
        Scanner r=new Scanner(System.in);
        n1=r.nextInt();
        n2=r.nextInt();
        for( i=n1;i<=n2;i++)
        {
            for( j=2;j<=i;j++)
            {
                   if(i%j==0)
                   break;
            }
            if(i==j)
            System.out.print(j + " ");
        }

    }
}
