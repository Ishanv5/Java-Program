                              /* Swapping two nos without third variable */
   import java.util.Scanner;
    class Swap2
    {
    	public static void main(String[] args) {
    		
    		int a,b;
    		System.out.print(" Enter any two nos ");
    		Scanner r=new Scanner(System.in);
    		a=r.nextInt();
    		b=r.nextInt();
    		System.out.print(" Before Swapping " +a+ " " +b);
    		a=a+b;
    		b=a-b;
    		a=a-b;
    		System.out.print(" After  Swapping " +a+ " " +b);
    	}
    }