package recursionarray;
import java.util.*;

public class maxvaluearr {

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        
        int ans = maxOfArray(arr, idx+1);
        if(ans < arr[idx]){
            ans = arr[idx];
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        
        int n = scr.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = scr.nextInt();
        }

        int idx = 0;

        int ans = maxOfArray(arr,idx);
        System.out.println(ans);
    }

}