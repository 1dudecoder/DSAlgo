import java.util.*;

public class Decimaltoany {

    public static int dta(int num, int n){
        int ans = 0 ;
        int p = 10;
        while(num != 0){
            int d = num % n;
            num = num/n;
            ans += d * p;
            p = p * 10;
        }
        return ans;
    }

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        int num = scr.nextInt();
        int n = scr.nextInt();
        int ans = dta(num,n);
        System.out.println(ans);

    }

    
}
