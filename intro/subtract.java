import java.util.*;
public class subtract {

    public static int subtraction(int n, int m, int base ) {

        int p = 1;
        int ans = 0;
        int br = 0;
        int d = 0;
    
        while(n != 0 || m != 0){

            int a = n % 10;
            n = n / 10;

            int b = m % 10;
            m = m / 10;

            a = a + br;

            if(a < b){
                d = (base + a) - b;
                br = -1;
                ans += d * p;

            }else{
                d = a - b;
                br = 0;
                ans += d * p;
            }
            
            p = p * 10;
        }
        return ans;
    }
    public static void main(String arg[]){

        Scanner scr = new Scanner(System.in);
        int b = scr.nextInt();
        int n = scr.nextInt();
        int m = scr.nextInt();

        int ans = subtraction(n,m,b);
        System.out.println(ans);
    }
    
}
