// Abstract Class Program
abstract class animal
{
    animal()
    {
        System.out.println(" All Animals .... ");
    }
    public abstract void sound();
    
}
class Dog extends animal
{
    Dog()
    {
        super();
    }
   public void sound()
   {
       System.out.println(" Dog is barking ");
   }
}
class Lion extends animal
{
    Lion()
    {
        super();
    }
    public void sound()
    {
        System.out.println(" Lion is Roar ");
    }
}
class Abstract 
{
    public static void main(String[] args) {
        Dog r=new Dog();
        Lion  l=new Lion();
        r.sound();
        l.sound();
    }
}
