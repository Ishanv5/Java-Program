// Interface Static Method
interface A 
{
    public static void show()
    {
        System.out.println(" Can't Override interface static methods ");
    }
}

class Staticinterface
{
    public static void main(String[] args) {
        A.show();
       
    }
}