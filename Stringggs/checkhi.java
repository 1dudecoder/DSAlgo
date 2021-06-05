import java.util.*;

package Stringggs;
public class checkhi{
public static void main(String arg[]){
 
    String str = "hihithihi";

    int i = 0;
    int j = str.length()-1;
    int count = 0;

    while(i < j){
        if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i' && str.charAt(i+2) != 't'){
            count += 1;
            i = i+2;
        }else{
            i++;
        }
    }

    System.out.println(count);
 

}

}
