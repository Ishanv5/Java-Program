//  write a java program length and breadth 
// of rectangle  
// print area and primeter and valid data 
class P7{
public static void main(String args[]){
  
  double length=Double.parseDouble(args[0]);
  double breadth=Double.parseDouble(args[1]);
if(length > 0.0 && breadth>0.0){
double peri=2*(length*breadth);
double area=length*breadth;
System.out.printf("Perimeter=%.2f%n",peri);
System.out.printf("Area=%.2f",area);
}
else{
System.out.println("Invalid input..");
}
}
}