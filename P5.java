// write to find sum and avg of 3 nos
class P5{
public static void main(String args[]){
double n1=Double.parseDouble(args[0]);
double n2=Double.parseDouble(args[1]);
double n3=Double.parseDouble(args[2]);
double sum= n1+n2+n3;
double avg=sum/3.0;
System.out.println("Sum ="+sum);
System.out.println("Avg ="+avg);
System.out.printf("Avg =%.2f",avg);
}
}