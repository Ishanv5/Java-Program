// Synchronization 
class Bus implements Runnable 
{
    int available =2,passanger;
    Bus(int passanger)
    {
      this.passanger=passanger;
    }
    public synchronized void run()
    {
        String name=Thread.currentThread().getName();
      if(available>=passanger)
      {
        System.out.println(name+" reserved seat ");
        available=available-passanger;
      }
      else
      {
          System.out.println(" Sryy! Seat not available ... ");
      }
    }
}
class Sync 
{public static void main(String[] args) {
    Bus r=new Bus(1);
    Thread t1=new Thread(r);
    Thread t2=new Thread(r);
    Thread t3=new Thread(r);
    t1.setName("Ishan");
    t2.setName("Vinit");
    t3.setName("Harsh");
    t1.start();
    t2.start();
    t3.start();
}
    
}