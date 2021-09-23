// Default Constructor
Class Default
{
  int a; String b; boolean c;
	Default() // Default Constructor
	{
      a=100;
      b="Ishan";
      c=true;
	}
	void Display()
	{
	System.out.print(a+" "+b+" "+c);
	}
}
class DefaultConstructor
{
	public static void main(String[] args) {
	
	Default r=new Default();
	r.Display();	
	}
	
}
