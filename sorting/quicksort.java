package sorting;

public class quicksort {

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

    public static void quicksort1(int[] arr, int si, int ei){

        if(si >= ei){
            return;
        }

        int pvt = ei;
        int p = partation(arr, si, ei, pvt);

        quicksort1(arr, si, p-1);
        quicksort1(arr, p+1, ei);

    }

    public static void main(String arg[]){
        int[] arr = {1,3,4,56,7,6,45,33,3,56,67,4,34};

        int si = 0;
        int ei = arr.length-1;
        quicksort1(arr, si, ei);

        int last = arr.length-1;
        int last3 = last - 2;
        
        System.out.println(arr[last3]);
    }

    
}
