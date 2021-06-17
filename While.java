                               /* While loop   */
    import java.util.Scanner;
    class While
   {
     public static void main(String[] args)
     {
          int n;
          System.out.println("  Enter a value for condition \n ");
          Scanner r=new Scanner(System.in);
          n=r.nextInt();
          while(n>=10)
          {
              System.out.println(" Learn coding  ..... ");
              ++n;
          }

     }
   }