import java.util.Scanner;
class Armstrong {
    
    public static void main(String[] args) {
        
        int n,arm=0,rem,c;
        System.out.print(" Enter any nos ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        c=n;
        while(n>0)
        {
            rem=n%10;
           arm= (rem*rem*rem)+arm;
           n=n/10;
        }
        if(c==arm)
        System.out.print(" Armstrong nos");
        else
        System.out.print(" Not Armstrong nos ");
    }
}
