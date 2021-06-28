                        /* Swap of two nos */
     import java.util.Scanner;
     class Swap
     {
     	public static void main(String[] args) {
     		
     		int a,b,temp=0;
     		System.out.print(" Enter value of  two variable ");
     		Scanner r=new Scanner(System.in);
     		a=r.nextInt();
     		b=r.nextInt();
     		
     		temp=a;
     		a=b;
     		b=temp;
     		System.out.println(a);
     		System.out.println(b);
     	}
     }