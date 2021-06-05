package recursionarray;
import java.util.*;

public class firstindex {

    public static int myindex(int[] arr,int data, int idx){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == data ){
            return idx;
        }
        int ans = myindex(arr, data, idx+1);
        return ans;
    }

    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);
        
        int n = scr.nextInt();

        int[] arr = new int[n];

        for(int i = 0 ; i < n; i++){
            arr[i] = scr.nextInt();
        }
        int data = scr.nextInt();

        int idx = 0;

        int ans = myindex(arr,data,idx);
        System.out.println(ans);
    }

}