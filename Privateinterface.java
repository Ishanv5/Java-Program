// Interface Private Method 
interface A 
{   default void call()
    {
        add(100,200);
    }
    private void add(int x,int y)
    {
        System.out.println(" Sum of two nos "+(x+y));
    }
}
class B implements A 
{
    public void sub(int x,int y)
    {
        System.out.println(" Difference of two nos "+(x-y));
    }
}
class Privateinterface 
{
    public static void main(String[] args) {
        B b=new B();
        b.call();
        b.sub(1000,900);
    }
}