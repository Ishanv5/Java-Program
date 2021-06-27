                       /* Eligible for vote or not */
 import java.util.Scanner;
    class Vote
    {
    	public static void main(String[] args) {
    		
    		int age;
    		System.out.print(" Enter your age ");
    		Scanner r=new Scanner(System.in);
    		age=r.nextInt();
    		if(age>=18)
    		{
               System.out.print(" Eligible for vote " );
    		}
    		else
    		{
    			System.out.print(" not  Eligible for vote " );
    		}
    
    	}
    }