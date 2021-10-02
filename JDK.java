// Interface Default Method  (JDK 1.8)
interface A 
{
    void a1();    
    void a2(); 
}
class B implements A 
{
    public void a1()
    {
        System.out.println("  Class B a1() ");
    }
    public void a2()
    {
        System.out.print(" Class B a2() ");
    }
}
class C implements A 
{
    public void a1()
    {
        System.out.println("  Class C a1() ");
    }
    public void a2()
    {
        System.out.print(" Class C a2() ");
    }
}
class D implements A 
{
    public void a1()
    {
        System.out.println("  Class D a1() ");
    }
    public void a2()
    {
        System.out.print(" Class D a2() ");
    }
}
class JDK
{
    public static void main(String[] args) {
        B b=new B();
        b.a1(); b.a2();
        C c=new C();
        c.a1(); c.a2();
        D d=new D();
        d.a1(); d.a2();

    }
}