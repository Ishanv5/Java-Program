// Suspend & Resume method 
class SuspendResume extends Thread
{
    public void run()
    {
        String n1=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(n1);
        }
    }
    public static void main(String[] args) {
        A t1=new A();
        A t2=new A();
        A t3=new A();
        t1.setName("Ishan");
        t2.setName("Harsh");
        t3.setName("Vinit");
        t1.start();
        t2.start();
        t2.suspend();
        t3.start();
        t2.resume();
    }
}
