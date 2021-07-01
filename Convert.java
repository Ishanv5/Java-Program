                         /* Convert character lower to upper & vice - versa */
   import java.util.Scanner;
   class  Convert
   {
   	public static void main(String[] args) {
   		
   		char ch,ch2;
   		System.out.print(" Enter any character ");
   		Scanner r=new Scanner(System.in);
        ch=r.next().charAt(0);
        if(ch>='A'  && ch<='Z')
        {
          ch2= Character.toLowerCase(ch);
          System.out.print(" Lowercase " + ch2);
        }
        else
        {
           ch2= Character.toUpperCase(ch);
          System.out.print(" Uppercase " + ch2);  
        }
   	}
   }