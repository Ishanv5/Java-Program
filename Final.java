// Final Keyword 
class Final
{
  /*  public static void main(String[] args) {
        final int A=10;   // Final variable 
        System.out.println(A);
      
    }*/
    void mNumber()
    {
        System.out.println("9372532652");
    }
    void atmPin()
    {
        System.out.println("345"); 
    }
}
class Thief extends Final 
{ 
    @Override 
    void mNumber()
    {
        System.out.println("9372532652");
    }
    @Override 
    void atmPin()
    {
        System.out.println("345"); 
    }
}
class final{
    public static void main(String[] args) {
        Thief t=new Thief();
        t.mNumber();
        t.atmPin();
    }
}