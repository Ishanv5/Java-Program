//Stop Method
class A extends Thread
{
    public void run()
    {
        String n1=Thread.currentThread().getName();
        for(int i=1;i<=3;i++)
        {
            System.out.println(n1);
        }
    }
}
class Stop{
    public static void main(String[] args) {
        A t1=new A();
        A t2=new A();
        A t3=new A();
        t1.setName(" Ishan");
        t2.setName(" Vinit");
        t3.setName(" Harsh");
        t1.start();t2.start();t3.start();
        t2.stop();
       
    }
}