import java.util.*;
public class multi {
    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();
        int b = scr.nextInt();

        int k = n ;
        int count = 0; 
        int br = 0;
        int a = 0;
        int p = 0;

        while(k != 0){
            count += 1;
        }
        while(count != 0){

            int i = n % 10;
            n = n / 10;

            int j = m % 10;
            m = m / 10;

            int ans = br + i * j;

            if(ans >= b){
               br = ans % b;
               int d = ans / b;

               ans += d * p;


            }
            
        }
    }
}
