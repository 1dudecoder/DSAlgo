package intro;
import java.util.*;

public class firstnlast {
    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int[] arr = new int[n];
    
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scr.nextInt();
        }
        int t = scr.nextInt();

        int lo = 0;
        int hi = arr.length-1;
        int last = -1;

        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(t > arr[mid]){
                lo = mid+1;
            }else if( t < arr[mid]){
                hi = mid-1;
            }else{
                last = mid;
                lo++;
            }
        }


        lo = 0;
        hi = arr.length-1;
        int first = -1;

        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(t > arr[mid]){
                lo = mid+1;
            }else if( t < arr[mid]){
                hi = mid-1;
            }else{
                first = mid;
                hi--;
            }
        }

        System.out.println(first);
        System.out.println(last);
    }
}






