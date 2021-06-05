package recursionarray;
import java.util.*;
public class displayarr {

    public static void dispalyrsearray(int[] arr, int idx){

        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        dispalyrsearray(arr,idx+1);
    }

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr =  new int[n];
        for(int i = 0 ; i < n;i++){
            arr[i] = scr.nextInt();
        }
        
        int idx = 0;

        dispalyrsearray(arr,idx);
    }
    
}
