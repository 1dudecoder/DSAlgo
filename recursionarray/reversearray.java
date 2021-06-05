package recursionarray;

public class reversearray {

    public static void printreversearray(int[] arr, int idx){

        if(idx == arr.length){
            return;
        }
        printreversearray(arr,idx+1);
        System.out.println(arr[idx]);
    }

    public static void main(String arg[]){

        int[] arr = {3,1,0,7,5};

        int idx = 0;

        printreversearray(arr,idx);
    }
    
}
