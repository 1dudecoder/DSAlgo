import java.util.*;
public class Main {
    

    public static ArrayList<String> getKPC(String str) {

        String key[] = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

        if (str.length() == 0) {
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        char ch =  str.charAt(0); 

        String temp = key[ch-'0'];

        ArrayList<String> recursion = getKPC(str.substring(1)); 

        ArrayList<String> res = new ArrayList<>();

        for (int i = 0; i < temp.length(); i++) { 
            char chr = temp.charAt(i); 
            for (String val : recursion) {
                res.add(chr + val);
            }
        }

        return res;

    }
    

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        String str = scr.next();
        ArrayList<String> s = getKPC(str);
        System.out.println(s);

    }
}