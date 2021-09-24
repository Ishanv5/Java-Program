// Private Constructor
class Constructor
{
    int a;
    double b;
    String c;
   private  Constructor()
    {
      a=10;b=20.5;c="ishan";
      System.out.println(a+" "+b+" "+c);
    }
    public static void main(String[] args) {
        Constructor r=new Constructor();
    }
}