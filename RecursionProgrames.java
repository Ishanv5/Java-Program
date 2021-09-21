// Recursion in java 
class RecursionProgrames {
      public static void main(String[] args) {
          RecursionProgrames r=new  RecursionProgrames();
          int a =r.sum(10);
          System.out.print(" Sum of first N natural nos "+ a);

      }
      int sum(int b)
      {
          if(b>0)
          {
              return b+sum(b-1);
          }
          else
          {
              return 0;
          }
      }
}
