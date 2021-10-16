// Synchronized block 
class msg
{
    public void show(String name )
    {
        ;;;;;;
        synchronized(this)
        {
            for(int i=1;i<=3;i++)
            {
                System.out.println(" How are U "+name);
            }
        }
        ;;;;;;
    }
}
class OurThread extends Thread
{
    msg m;
    String name;
    OurThread(msg m,String name )
    {
        this.m=m;
        this.name=name;
    }
    public void run()
    {
        m.show(name);
    }
}
class Syncblock
{
    public static void main(String[] args) {
        msg m=new msg();
        OurThread t1=new OurThread(m,"Ishan");
        OurThread t2=new OurThread(m,"Harsh");
        t1.start(); t2.start();
    }
}