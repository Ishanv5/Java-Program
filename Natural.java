                            /* First  N Natural nos */
 import java.util.Scanner;
 class Natural
 {
 	public static void main(String[] args) {
 		
 		int n;
 		System.out.println(" Enter a nos ");
 		Scanner r=new Scanner(System.in);
 		n=r.nextInt();
 		for(int i=1;i<=n ;i++)
 		{
 			System.out.print(i + " ");
 		}
 	}
 }