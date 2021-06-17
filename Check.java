                           /* vowel or consonant */
    import java.util.Scanner;
     class Check
     {
     	  public static void main(String[] args) {
     	  	
     	  	char ch;
     	  	System.out.print(" Enter any character ");
     	  	Scanner r=new Scanner(System.in);
     	  	ch=r.next().charAt(0);
     	  	if( ch=='a' ||  ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' ||  ch=='E' || ch=='I' || ch=='O' || ch=='U')
     	  	{
                      System.out.print( " Vowels "  );
     	  	}
     	  	else
     	  	{
                System.out.print( " Consonant "  );
     	  	}
     	  }
     }