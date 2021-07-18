/* Different ways to print array element */
class Array {
   public static void main(String[] args) {
       int a[]=new int[3];
       a[0]=10;
       a[1]=20;
       a[2]=30;
      /* for(int i=0;i<3;i++)   // 1 way using for loop
       {
              System.out.print(a[i]+ " ");
       }*/
       for(int b : a)   // 2 way using foreach loop
       {
           System.out.print(b+ " ");
       }
   } 
}
