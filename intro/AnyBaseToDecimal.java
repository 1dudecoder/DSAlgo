import java.util.*;

public class AnyBaseToDecimal {

    public static int dta(int num, int n){

        int p = 1;
        int ans = 0;
        while(num != 0){
            int d = num%10;
            num = num/10;
           ans += d * p;
           p = p * n;
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
