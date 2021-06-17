                       /* Odd and Even Program */
import java.util.Scanner; 
 class Odd
 {
 	public static void main(String[] args) {
 		
 		int n;
 		System.out.println(" Enter any number ");
 		Scanner r=new Scanner(System.in);
 		n=r.nextInt();
 		if(n%2==0)
 			System.out.println(" Even nos ");
 		else
 			System.out.println(" Odd nos ");

 	}
 }