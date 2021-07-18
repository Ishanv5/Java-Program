   // toString() method  / asList() method / deepToString() method 
   import java.util.Arrays;
   class ArrayMethod
   {
       public static void main(String[] args) {
           
        String a[]={" Learn ","Coding "," Keypoint "," Education "};
        System.out.println(" toString() method " + Arrays.toString(a));
        System.out.println(" asList() method " +Arrays.asList(a));
        int arr[][]={{10,20},{30,40}};
        System.out.println(" deepToString() method " +Arrays.deepToString(arr));
       }
   }