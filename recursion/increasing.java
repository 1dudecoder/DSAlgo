package recursion;
import java.util.*;
public class increasing {
    public static void increase(int a, int b){
        if(a > b){
            return;
        }
        System.out.println(a);
        increase(a+1, b);
    }

    public static void decrese(int a, int b){
        if(a > b){
            return;
        }
        decrese(a+1, b);
        System.out.println(a);
    }

    public static void incresedecrese(int a, int b){
        if(a > b){
            return;
        }

        System.out.println(a);  //question -- first decrese the increase
        incresedecrese(a+1, b);
        System.out.println(a);
    }

    public static int factorial(int a){
        
        if(a==0) return 1;
        int rec = factorial(a-1);
        return rec * a;
    }

    public static int power(int a,int b){
        if(b==0) return 1;
        int rec = power(a,b-1);
        return rec * a;
    }
    
    public static int powerlog(int a,int b){
        if(b==0) return 1;
        int rec = power(a,b/2);
        rec *= rec;
        
        return b % 2 == 0 ? rec : rec * a;
    }
    

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();

        int ans = power(a,b);
        System.out.println(ans);
    }
}
