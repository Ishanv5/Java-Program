// Find Square root of a nos 
import java.util.Scanner;
class SquareRoot
{
    public static void main(String[] args) {
        int n;
        System.out.print(" Enter any nos ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        double m=Math.sqrt(n);
        System.out.print(" Square root of " +n+ " is " +m);
    }
}