package sorting;

public class margesort {
    //1 element is already sorted so we merge 2 array  and finally all array is sorted ;

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static int partation(int[] arr, int si, int ei, int data){
        swap(arr,ei,data);
        int itr = si;
        int p = si-1;
        while(itr <= ei){
            if(arr[itr] <= arr[ei]){
                swap(arr,itr,++p);
            }
            itr++;
        }
        return p;
    }


    
    
}
