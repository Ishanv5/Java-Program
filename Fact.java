                            /* factorial of nos */
   import java.util.Scanner;
    class Fact
    {
    	public static void main(String[] args) {
    		
    		int n,fact=1;
    		System.out.print(" Enter a nos ");
    		Scanner r=new Scanner(System.in);
    		n=r.nextInt();
    		for(int i=1;i<=n;i++)
    		{
                   fact=fact*i;
    		}
    		System.out.print(" Factorial of nos " + fact);
    	}
    }