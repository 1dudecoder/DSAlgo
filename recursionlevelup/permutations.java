package recursionlevelup;
import java.util.Scanner;

public class permutations {

    public static void decording(String str, String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }else if(str.length() == 1){
            char ch = str.charAt(0);
            if(ch == '0'){
                return;
            }else{
                int mynum = (ch - '0');
                char realchar = (char) ('a'+ mynum - 1);
                System.out.println(ans + realchar);
            }
        }else{
            char ch = str.charAt(0);
            String ls = str.substring(1);
            if(ch == '0'){
                return;
            }else{
                int mynum = (ch - '0');
                char realchar = (char) ('a'+ mynum - 1);
                decording(ls, ans + realchar);
            }

            String bigch = str.substring(0,2);
            String bigls = str.substring(2);

            int mych = Integer.parseInt(bigch); 
            if(mych <= 26){
                char realchar = (char) ('a'+ mych - 1);
                decording(bigls, ans + realchar);
            }
        }

    }

    public static void prm(String str , String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 0 ; i < str.length();i++){
            char ch = str.charAt(i);
            String rs = str.substring(0, i);
            String ls = str.substring(i+1);
            String reqstring = rs + ls;

            prm(reqstring, ans + ch);
        }
    }
    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        String str = scr.next();
        String ans = "";
        decording(str,ans);
    }
    
}
