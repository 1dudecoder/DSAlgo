package recursionarray;

import java.util.Scanner;

public class arrstore {

    public static int[] arrindex(int[] arr,int idx,int data, int count){
        
        if(idx == arr.length){
            return new int[count];
        }

        if(arr[idx] == data){
            count++;
        }

        int[] ans = arrindex(arr, idx+1, data, count);

        if(arr[idx] == data){
            ans[count-1] = idx;
        }

        return ans;
    }

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = scr.nextInt();
        }
        int data = scr.nextInt();
        int idx = 0;
        int count = 0;
        int[] ans = arrindex(arr,idx,data,count);
        
        for (int i : ans) {
            System.out.println(i);
        }

    }

    
}
