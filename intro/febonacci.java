import java.util.Scanner;

public class febonacci {

    public static Scanner scr = new Scanner(System.in);

    public static void main(String arg[]){

        int n = scr.nextInt();
        int k = scr.nextInt();
        
        int tot = count(n);

        if(k > 0){
            k = k + tot;
        }

        int pow  = getpow(k);
        int myans = reverse(n,pow,k);
        System.out.println(myans);

    }

public  static int reverse(int n , int pow, int k) {

    int num = n%pow;

    int lvalue = n/pow;

    int ccount = count(n);

    int div = 0;
    int mul = 0;

    for(int i = 0; i < ccount; i++){
        if(ccount < k){
            div++;
        }else{
            mul++;
        }
    }

    return (num * mul) + lvalue;

}


public static int count(int n){
    int c = 0;
    while(n != 0){
        n = n/10;
        c++;
    }
    return c;
}


public static int getpow(int k){
    int p  = 1;
    while(k != 0){
        p = p * 10;
        k--;
    }
    return p;
}

}