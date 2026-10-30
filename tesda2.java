import java.lang.reflect.Array;
import java.util.Arrays;

public class tesda2{
    public static void main(String[]args){
        // DECLARATION OF ARRAY
        String[] fruits = {"Apple","Banana","Avocado"};
        int [] nums = {4,5,7,3,21,4};
        
        // FOR EACH
        for(int nn : nums){
            System.out.println(nn * 2 );
        }


        Arrays.sort(fruits);

        for(String f : fruits){
            System.out.println(f);
        }


       
        
    }
}