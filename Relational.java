                        /* Relational Operator........ */
 import java.util.Scanner;
  class Relational
  {
   public static void main(String args[])
   {
   	int a,b;
   	System.out.print("Enter two nos");
   	Scanner obj=new Scanner(System.in);
   	a=obj.nextInt();
   	b=obj.nextInt();
   	System.out.println(" True/False "+(a<b));
   	System.out.println(" True/False "+(a>b));
   	System.out.println(" True/False "+(a<=b));
   	System.out.println(" True/False "+(a>=b));
   	System.out.println(" True/False "+(a==b));
   	System.out.println(" True/False "+(a!=b));
   }
  }