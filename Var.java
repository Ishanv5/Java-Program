// Var-args Method 
class A 
{
    void add(int ... a) // var-args method
    {
          int sum=0;
          for(int x:a)
          {
              sum=sum+x;
          }
          System.out.println(" Sum of number  "+sum);
    }
}
class Var
{
    public static void main(String[] args) {
        A r=new A();
        r.add();
        r.add(100);
        r.add(100,200);
        r.add(20,30,40);
        r.add(10,20,30,40,50);
    }
}