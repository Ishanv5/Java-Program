// Parameterised Constructor 
class Para{
    int x,y;
    Para(int a,int b)
    {
          x=a;
          y=b;
    }
    void show()
    {
      System.out.println(x+ " "+y);
    }
}
class Parameter
{
    public static void main(String[] args) {
        Para r=new Para(100,200);
        r.show();
    }
}