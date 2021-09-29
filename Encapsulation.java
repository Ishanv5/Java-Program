// Java Encapsulation 
class A{
    private int value;// data hiding
    public void setValue(int x) // data Abstraction 
    {
       value=x;
    }
    public int getValue()
    {
        return value;
    }
}
class Encapsulation
{
    public static void main(String[] args) {
        A r=new A();
        r.setValue(100);
        System.out.println(r.getValue());
    }
}