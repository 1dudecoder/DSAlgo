import java.util.*;
public class mutiply {
    public static int multipy(int n ,int m,int base){
        int p = 1 ;
        int ans = 0;
        int c = 0;
        int mul = 0;
        while(n != 0 || c != 0){
            int a = n % 10;  // bda hai
            n = n / 10;
            int d =  c + a * m;
            if(d >= base){
               mul =  d % base;
               c = d / base;
               ans += mul * p;
            }else{
                mul = d;
                c = 0;
                ans += mul * p;
            }
            p = p * 10;
        }
        return ans;
    }

    public static int getSum(int b, int n1, int n2) {
        
        int rv = 0;
        int c = 0;
        int p = 1;
        
        
        while(n1  > 0 || n2 > 0 || c > 0){
            
            int v1 = n1 % 10;
            int v2 = n2 % 10;
            
            n1 = n1 /10;
            n2 = n2/ 10;

            int d = v1 + v2 + c;
            
            c = d / b;
            d = d % b;
            
            rv  += d * p;
            p = p * 10;
            
        }
        
        return rv;
        
    }

    public static int allnumbermul(int n, int m, int base){

        int ans = 0;
        int p = 1;
        
        while (m > 0){
            
           int d2 = m % 10;
           m = m / 10;
           int getmulti = multipy(n,d2,base);
           ans =  getSum(base, getmulti * p, ans);
            p = p * 10;
        }
            return ans;
    }

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        int base = scr.nextInt();
        int n = scr.nextInt();
        int m = scr.nextInt();
       int ans = allnumbermul(n,m,base);
        System.out.println(ans);
    }
}
