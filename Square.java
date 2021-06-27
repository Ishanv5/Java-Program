                          /* Area of Square */
     import java.util.Scanner;
      class Square
      {
      	public static void main(String[] args) {
      		
      		int side,area;
      		System.out.print(" Enter side of Square ");
      		Scanner r=new Scanner(System.in);
      		side=r.nextInt();
      		area=side*side;
      		System.out.print(" Area of Square " + area);
      	}
      }