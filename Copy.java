// Copy Constructor
class con  
{
  int a; String b;
  con()
  {
      a=10;
      b="ISHAN";
      System.out.println(a+" "+b);
  }
  con(con ref)
  {
     a=ref.a;
     b=ref.b;
     System.out.println(a+" "+b);
  }
}
class Copy{
    public static void main(String[] args) {
        con r=new con();
        con r2=new con(r);
    }
}