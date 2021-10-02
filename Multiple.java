// Multiple Inheritance
interface  A
{
    void show();
}
interface  B
{
    void show();
}
class Multiple implements A,B 
{ public  void show()
    {
        System.out.println(" Learn Code ");
    }
    public static void main(String[] args) {
        Multiple m=new Multiple();
        m.show();
    }
}
