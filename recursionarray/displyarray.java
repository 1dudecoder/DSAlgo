package recursionarray;

public class displyarray {

    public static void printArray(int[] arr, int i ){
        if(i == arr.length){
            return;
        }
        System.out.println(arr[i]);
        printArray(arr, i-1);
    }

    public static void printReverseArray(int[] arr, int i){
        if(i == arr.length){
            return;
        }
        printArray(arr, i-1);
        System.out.println(arr[i]);
    }

    
    public static int maximum(int[] arr, int idx) {
        if(idx == arr.length-1){
            return arr[idx];
        }
        int ans = maximum(arr, idx+1);
        if(ans < arr[idx]){
            ans = arr[idx];
        }
        return ans;

    }

    public static int minimum(int[] arr, int idx) {
        if(idx == arr.length-1){
            return arr[idx];
        }
        int ans = minimum(arr, idx+1);
        if(ans > arr[idx]){
            ans = arr[idx];
        }
        return ans;

    }

    public static boolean findData(int[] arr, int idx, int data) {
        if(idx == arr.length-1){
            return false;
        }
        boolean ans = findData(arr, idx+1, data);
        if(ans){
            return true;
        }
        return arr[idx] == data;
    }

    public static boolean findData2 (int[] arr, int idx, int data) {
        if (idx == arr.length)
            return false;
        if (arr[idx] == data)
            return true;
        return findData(arr, idx + 1, data);
    }


    // public static int firstIdx(int[] arr, int idx, int data) {

    // }

    // public static int lastIdx(int[] arr, int idx, int data) {

    // }

    public static int[] allIndex (int[] arr, int idx, int data){   // ?? -> X(ArrayList, Array)

    }
    public static void main(String[] args) {
        int[] arr = { 12, 3, 2,4, 34, 3, 4, 2, 2, 76 };
        // System.out.println(maximum(arr, 0));
        // System.out.println(minimum(arr, 0));
        System.out.println(findData(arr, 0, 2));
        // System.out.println(firstIdx(arr, 0, 2));
        // System.out.println(lastIdx(arr, 0, 2));
    }
}
