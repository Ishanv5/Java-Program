// throw vs throws & try-catch
class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg)
    {
        System.out.println(msg);
    }
}
class Atttc
{
    public static void main(String[] args) {
        try{
      vote(20); 
        }
        catch(Exception e)
        {
               System.out.println(e);
        } 
    }
    public static void vote(int age ) throws InvalidAgeException
    {
        if(age<18)
        {
           throw new InvalidAgeException(" Not Eligible for votting ");
        }
        else
        {
            System.out.println(" Eligible for votting ");
        }
    }
}