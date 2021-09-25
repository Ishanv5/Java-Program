// Multi-Level Inheritance 
class A // Super class
{
    int a,b,c;
    void Add()
    {
        a=10; b=20;
        c=a+b;
        System.out.println(" Sum of Two nos "+c);
    }
    void Sub()
    {
        a=100; b=20;
        c=a-b;
        System.out.println(" Substraction  of Two nos "+c);
    }
}
class B extends A  // sub1 class
{
       void multi()
       {
           a=20; b=30;
           c=a*b;
           System.out.println(" Multiplication  of Two nos "+c);
       }
       void divi()
       {
        a=100; b=50;
        c=a/b;
        System.out.println(" Division   of Two nos "+c);
       }
}
class Multilevel extends B //sub2 class
{
    void rem()
   { a=20; b=3;
           c=a%b;
           System.out.println(" Remainder  of Two nos "+c);
   }
   public static void main(String[] args) {
       Multilevel r=new Multilevel();
       r.Add();
       r.Sub();
       r.multi();
       r.divi();
       r.rem();
   }
}
