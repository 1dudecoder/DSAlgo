import java.util.*;
public class anytoanybase {
    public static int AnyBaseToDecimal(int num, int n){

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

   public static int getValueInBase(int num, int n){
    int ans = 0 ;
    int p = 1;
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
    int b = scr.nextInt();
    int n = scr.nextInt();

    int ans = AnyBaseToDecimal(num,b);
    int ans2 = getValueInBase(ans,n);
    
    System.out.println(ans2);
}

}
