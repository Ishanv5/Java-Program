import javax.lang.model.util.ElementScanner14;

// Compare Array
import java.util.Arrays;
class CompareArray {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50};
        int b[]={10,20,30,40,50};
       /*
        if(a==b)
        {
          System.out.print(" Both are Equal ");
        }
        else
        {
            System.out.print(" Both are not  Equal ");   
        }
        */
        if(Arrays.equals(a,b))
        {
          System.out.print(" Both are Equal ");
        }
        else
        {
            System.out.print(" Both are not  Equal ");   
        } 
    }
}
