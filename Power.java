                          /* Calculate Power of nos */
  import java.util.Scanner;
   class Power
   {
   	  public static void main(String[] args) {
   	  	
   	  	int n,p,result=1;
   	  	System.out.print(" Enter  a nos  ");
   	  	Scanner r=new Scanner(System.in);
   	  	n=r.nextInt();
   	  	System.out.print(" Enter  a Power ");
   	  	p=r.nextInt();
   	  	for(int i=1;i<=p;i++)
   	  	{
            result=n*result;
   	  	}
   	  	
   	  	System.out.print(" Power "+ result);

   	  
   	  }
   }