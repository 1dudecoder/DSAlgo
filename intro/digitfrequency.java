import java.util.*;
public class digitfrequency {
    
    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int b = scr.nextInt();
        int count = 0;
        while(n != 0){
            int d = n % 10;
            n = n/10;
            if(d == b){
                count += 1;
            }
        }
        System.out.println(count);
    }

}
