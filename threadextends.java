// By Eextending thread class
class A extends Thread
{
    public void run()
    {
        try{
        for(int i=1;i<=5;i++)
        {
            System.out.println(" ISHAN ");
            Thread.sleep(1000);
        }
    }
    catch(InterruptedException i)
    {
        System.out.println(i);
    }
    }
}
class threadextends
{
    public static void main(String[] args)throws InterruptedException {
        A t=new A();
        t.start();
        for(int i=1;i<=5;i++)
        {
            System.out.println(" ISHAN Vaghela ");
            Thread.sleep(1000);
        }
    }
}
