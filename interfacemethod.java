// Interface Methods
interface client{
    void design();     // public + abstract 
    void webdevelop();// public + abstract 
}
abstract class IshanSoftware implements client
{
    @Override
   public void design()
   {
       System.out.println(" Black ,top menu, three dot buttom ");
   }

}
class HarshTech extends IshanSoftware
{
    @Override
    public void webdevelop()
    {
        System.out.println(" HTML,CSS,JavaScript  ");
    }
}
class interfacemethod
{
    public static void main(String[] args) {
        HarshTech r=new HarshTech();
        r.design();
        r.webdevelop();

    }
}