import java.util.*;
public class Main {
    
    public static ArrayList<String> subseq(String str){

        if(str.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        char a = str.charAt(0);
        ArrayList<String> recans = subseq(str.substring(1));

        ArrayList<String> myans = new ArrayList<>(recans);

        for(String x : recans){
            myans.add(a+x);
        }
        return myans;
    }

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        String str = scr.next();
        ArrayList<String> s = subseq(str);
        System.out.println(s);
    }
}
