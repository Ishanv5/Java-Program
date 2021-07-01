                      /* Check Divisibilitry of 5 */
 import java.util.Scanner;
  class Divisible
  {
  	public static void main(String[] args) {
  		
  		int n;
  		System.out.print(" Enter any nos ");
  		Scanner r=new Scanner(System.in);
  		n=r.nextInt();
  		if(n%5==0)
  		{
           System.out.print(" Divisible by 5 "); 
  		}
  		else
  		{
             System.out.print(" Not Divisible by 5  ");
  		}
  	}
  }