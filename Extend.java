// Extending interface
interface Gill 
{
  void add();
}
interface Ishan extends  Gill
{
    void sub();
}
class Harsh implements Ishan
{
    @Override
 public  void add()
  {
      int a=10,b=20,c;
      c=a+b;
      Systen.out.println(" Addition "+c);
  }
  @Override
 public  void sub()
  {
      int a=100,b=20,c;
      c=a-b;
      Systen.out.println(" Substraction "+c);
  }
}
class Extend
{
    public static void main(String[] args) {
        Ishan h=new Harsh();
        h.add();
        h.sub();
    }
}