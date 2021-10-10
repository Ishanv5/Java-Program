// Exception ProPagation
class liveDemo
{
    public static void main(String[] args) {
       m1(); 
    }
    public static void m1()
    {
        try
        {
          m2();
        }
        catch(ArithmeticException a)
        {
            System.out.println(" Exception Handled !... ");
        }
    }
    public static void m2()
    {
       System.out.println(10/0);
    }
}