// Factorial using Recursion 
import java.util.Scanner;
class RecursionFactorial {
    public static void main(String[] args) {
        int n;
      System.out.print(" Enter any nos ");  
      Scanner r=new Scanner(System.in);
      n=r.nextInt();
      RecursionFactorial obj=new RecursionFactorial();
      int result =obj.fact(n);
      System.out.print(" Factorial "+ result);
    }
    int fact(int a)
    {
        if(a==1)
        return 1;
        else
        return a*fact(a-1);
    }
}
