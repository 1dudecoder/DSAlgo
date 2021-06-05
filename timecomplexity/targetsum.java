package timecomplexity;

import sorting.quicksort;

public class targetsum {

    public static void targetsum(int[] arr, int data){        
        
        quicksort(arr,0,arr.length-1);

        int si = 0, ei = arr.length-1;
        while(si <= ei){
            if(arr[si]+arr[ei] == data){
                System.out.println("your ans is: " + arr[si++] + " " + arr[ei--]);  
            }else if(arr[si]+arr[ei] > data){
                ei--;
            }else{
                si++;
            }
        }

    }

    
    
    public static void main(String arg[]){
        int[] arr = [2,4,5,67,7,8,85,4,3,22];
        targetsum(arr,24);
    
    }
}