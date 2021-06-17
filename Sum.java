             /*  Sum of  first n natural nos */
import java.util.Scanner;
class Sum
{
    public static void main(String[] args) {
        
        int n,sum=0;
        System.out.print(" Enter a nos ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            System.out.print(" Sum of first n natural nos " + sum);
        }
    }
}