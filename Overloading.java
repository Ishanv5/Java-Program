// Constructor Overloading
class Cons 
{
    int a;
    double b;
    String c;
    Cons()
    {
       a=100;
       b=20.0;
       c="IshanSoftware";
     
    }
    Cons(int x)
    {
     a=x;
    }
    Cons(double y,String z)
    {
         b=y;
         c=c;
    }
   
}
class OverLoading
{ 
    public static void main(String[] args) {
    Cons r=new Cons();
    Cons r2=new Cons(25);
    Cons r3=new Cons(24.9,"LearnCode");
    System.out.println(r.a+" "+r.b+" "+r.c);
    System.out.println(r2.a);
    System.out.println(r3.b+" "+r3.c);
} 
}
    