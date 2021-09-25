// Instance Block 
class Block{

    int a,b;
    void show()
    {
        a=50;
        b=80;
        System.out.println(a+" "+b);
    }
    Block(){
        a=30; b=40;
        System.out.println(a+" "+b);
    }
    {
        a=20;
        b=60;
        System.out.println(a+" "+b);
    }
}
class Instances{
    public static void main(String[] args) {
        Block r=new Block();
        r.show();
    }
}