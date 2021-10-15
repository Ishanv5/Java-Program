// Thread Priority
class A extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
    }
}
class priority
{
    public static void main(String[] args) {
        A t1=new A();
        A t2=new A();
        A t3=new A();
        t1.setName("Ishan");
        t2.setName("Harsh");
        t3.setName("Vinit");
        t1.setPriority(2);
        t2.setPriority(4);
        t3.setPriority(3);
        t1.start();
        t2.start();
        t3.start();
    }
}

