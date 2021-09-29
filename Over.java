// Method Overloading
class Over
{
    void add()
    {
        int a=10,b=30,c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x,int y)
    {
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x,double y )
    {
        double c;
        c=x+y;
        System.out.println(c);
    }
    public static void main(String[] args) {
        Over r=new Over();
        r.add();
        r.add(20,50);
        r.add(60,45.32);

    }
}