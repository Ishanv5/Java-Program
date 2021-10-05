// try-catch-finally 
class Handling {
    public static void main(String[] args) {
        try{
              
              System.out.println(" Learn code ");
               int a=20,b=2,c;
               c=a/b;
               System.out.println(c);
               System.out.println(" Learn coder ");
        }
        catch(ArithmeticException a)
        {
            System.out.println("can't divide by zero ");
        }
        finally
        {
            System.out.println(" freelancher ");
        }
        System.out.println(" Learn beginner ");
    }
}