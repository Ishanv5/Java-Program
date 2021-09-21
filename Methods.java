// How to used Method 
import java.util.Scanner;
class Methods {
    int n1,n2,add,sub,multi,div,rem;
   
    public static void main(String[] args) {
      Methods ref=new Methods();
      ref.input();
      ref.process();
      ref.output();    
    }
    void input()
    {
        Scanner r=new Scanner(System.in);

        System.out.print(" Enter two nos ");
         n1=r.nextInt();
         n2=r.nextInt();
        
    }
    void process()
    {
       add=n1+n2; 
       sub=n1-n2;
       multi=n1*n2;
       div=n1/n2;
       rem=n1%n2;
    }
    void output()
    {
        System.out.println(" Sum of two nos "+ add);
        System.out.println(" subtraction of two nos "+ sub);
        System.out.println(" multiplication  of two nos "+ multi);
        System.out.println(" division  of two nos "+ div);
        System.out.println(" remainder of two nos "+ rem);
    }
}
