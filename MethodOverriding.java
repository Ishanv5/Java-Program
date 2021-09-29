// Method Overriding 
class Shape
{
    void draw()
    {
        System.out.println(" Can't Say Shape  type ");
    }
}
class Square extends Shape
{ 
    @Override
    void draw()
    {
        System.out.println(" Square Shape ");
    }
}
class MethodOverriding
{
    public static void main(String[] args) {
        Shape r=new Square();
        r.draw();
    }
}