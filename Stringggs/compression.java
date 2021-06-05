package Stringggs;
import java.util.*;
public class compression {
    

    public static String mynum(String str){
        
        char o = str.charAt(0);
        String s = Character.toString(o);

        for(int i = 1; i < str.length(); i++){
            char a = str.charAt(i);
            char b = str.charAt(i-1);
            if(b != a){
                s += a;
            }
        }
        return s;
    }
    public static String mynumcounter(String str){
        int count = 1 ;
        char o = str.charAt(0);
        String s = Character.toString(o);

        for(int i = 1; i < str.length(); i++){
            char a = str.charAt(i);
            char b = str.charAt(i-1);

            if(b == a){
                count += 1;
            }else{
                if(count > 1){
                    s += count;
                    count = 1;
                }
                if(count == 1) {
                    s += a;
                }
            }
        }
        if(count > 1){
            s += count;
        }
        return s;
    }
    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        String str = scr.next();
        String ans = mynumcounter(str);
        String ans1 = mynum(str);

        System.out.println(ans1);
        System.out.println(ans);
    }
}
