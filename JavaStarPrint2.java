// Java Star Pattern part 2 
class JavaStarPrint2 {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=20;i++)
        {
           for(j=1;j<=20;j++)
           {
               if(i==1 || i==20 || j==1 || j==20)
                 System.out.print("*");
                 else
                 System.out.print(" ");
           }
           System.out.print("\n");
        }
    }
    
}
