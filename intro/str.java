import java.util.*;
public class str {

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scr.nextLine();
        }

        for(int i = 0; i < arr.length; i++){
           System.out.println(arr[i]);
        }
    }
}
