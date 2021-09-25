// Simple(Single ) Inheritance
class Student // Super Class
{
    int roll,marks;
    String name;
    void input()
    {
        System.out.println(" Enter roll name & marks  : ");
    }
}
class Ishan2 extends  Student // Sub class
{
    void Display()
    {
        roll=20;
        name="Ishan";
        marks=90;
        System.out.println(roll+" "+name+" "+marks);
    }
    public static void main(String[] args) {
        Ishan2 r=new Ishan2();
        r.input();
        r.Display();
    }
}