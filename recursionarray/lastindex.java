package recursionarray;
import java.util.*;

public class lastindex {

    public static int firstindex(int[] arr,int data, int idx){
        if(idx == arr.length){
            return -1;
        }
        int ans = firstindex(arr, data, idx+1);
        if(ans != -1 && arr[ans] == data){
            return ans;
        }
        if (arr[idx] == data ){
            return idx;
        }
        return ans;
    }

    public static int lastindex(int[] arr,int data, int idx){

        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == data ){
            return idx;
        }
        int ans = lastindex(arr, data, idx+1);
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

        int ans = firstindex(arr,data,idx);
        int ans2 = lastindex(arr,data,idx);
        System.out.println(ans2);
        System.out.println(ans1);

    }

}