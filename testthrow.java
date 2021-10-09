// throw vs throws 
class testthrow
{
    void div(int a,int b) throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException();
        }
        else
        {
            int c=a/b;
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
         testthrow t=new testthrow();
         try{
         t.div(20,0);
         }
         catch(Exception e)
         {
            System.out.println(" The value of b = 0 ");
         }
    }
}