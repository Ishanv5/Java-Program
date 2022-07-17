class P6{
public static void main(String args[]){
final double PI=3.14;

double radius=Double.parseDouble(args[0]);
if(radius > 0.0){
double area=PI*radius*radius;
double circumference=2*PI*radius;
System.out.printf("Area=%.2f%n",area);
//System.out.println();
System.out.printf("Circumference=%.2f",circumference);
}
else{
System.out.println("Invalid input...");
}
}
}