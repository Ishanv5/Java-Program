// Join Method 
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
class Join{
    public static void main(String[] args) {
        A t1=new A();
        A t2=new A();
        A t3=new A();
        t1.setName(" Thread 1");
        t2.setName(" Thread 2");
        t3.setName(" Thread 3");
       t2.start();
       try
       {
          t2.join();  
       }
       catch(InterruptedException e)
       {
         System.out.println(e);
       }
       t1.start();
       t3.start();
    }
}