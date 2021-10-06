// try-catch-finally inside finally block
class nestedFinally
{
    public static void main(String[] args) {
       try  
        {
           String a="ishan";
           System.out.println(a.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {   try{
            System.out.println(10/0);
        }
        catch(ArithmeticException a)
        {
            System.out.println(a);
        }
        finally
        {
            System.out.println(" Learn code with Ishan ");
        }
        }
        System.out.println(" Main method ended ");
    }
    
    
}