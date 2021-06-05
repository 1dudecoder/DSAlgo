package Stringggs;
import java.util.*;

public class pallendrom {
    
    public static boolean ispalendrome(String str){
        int i = 0;
        int j = str.length()-1;

        while(i <= j){
            char c1 = str.charAt(i);
            char c2 = str.charAt(j);

            if(c1 != c2){
                return false;
            }else{
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String arg[]){

        Scanner scr = new Scanner(System.in);

        String str = scr.next();

        for(int i=0; i < str.length(); i++){

            for(int j = i+1; j <= str.length();j++){

                String check = str.substring(i , j);

                if(ispalendrome(check) == true){
                    System.out.println(check);
                }
            }
        }
    }
}
