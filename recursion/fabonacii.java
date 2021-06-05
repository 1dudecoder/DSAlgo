package recursion;
// import java.util.*;
public class fabonacii {

    public static int fabo(int n){
        if(n <= 1){
            return n;
        }
        int count = 0;
         count += fabo(n-1);
         
         count += fabo(n-2);

        return count;
    }

    public static void main(String arg[]){
        int n = 5;
        int ans = fabo(n);
        System.out.println(ans);
    }    
}
