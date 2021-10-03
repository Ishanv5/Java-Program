// @Override annotation
class A 
{
   void show()
   {
         System.out.println(" Super class ");
   }
}
class B extends A 
{
    @Override 
  void show()
  {
    System.out.println(" Sub class ");
  }
} 
class override 
{
    public static void main(String[] args) {
        
            B b=new B();
            b.show();
        
    }
}