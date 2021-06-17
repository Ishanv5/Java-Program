  import java.util.Scanner;
  class ifElse
  {
     public static void main(String[] args)
     {
     	int n;
     	System.out.println(" Enter an number ");
     	Scanner r=new Scanner(System.in);
      n=r.nextInt();
      if(n>=0)
      {
         System.out.println(" Positive number ");
      }
      else
      {
         System.out.println(" Negative number  ");
      }

     }
  }