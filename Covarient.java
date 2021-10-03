// Co-varient return_type
class A 
{
  A show()
  {
    System.out.println(" Learn code with  Ishan ");
    return this;
  }
}
class B extends A 
{  
    @Override 
   B show()
   {
    System.out.println(" Learn coding skill  with  Ishan ");
    return this;
   }
}
class Covarient
{
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}