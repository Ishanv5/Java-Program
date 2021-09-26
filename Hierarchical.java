// Hierarchical Inheritance 
class A 
{
  void input()
  {
      System.out.println(" Enter your name ");
  }

}
class B extends A 
{
   void Show()
   {
       System.out.println(" My name is Ishan ");
   }
}
class C extends A 
{
     void Display()
     {
         System.out.println(" My name is Lucifer ");
     }
}
class Hierarchical
{
    public static void main(String[] args) {
        B r=new B();
        C r2=new C();
        r.input();
        r.Show();
        
        r2.input();
        r2.Display();
    }
}