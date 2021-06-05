public class sortbasic{

    public static void swap(int[] arr, int itr, int pvt ){
        int temp = arr[itr];
        arr[itr] = arr[pvt];
        arr[pvt] = temp;
    }

    public static void sort01(int[] arr){
        int pvt = -1;
        int itr = 0;
        while(itr <= arr.length-1){
            if(arr[itr] == 0){
                swap(arr,itr,++pvt);
            }
            itr++;
        }
        for(int x : arr){
            System.out.println(x);
        }
    }

    public static void sort012(int[] arr){
        int p1 = -1;
        int p2 = arr.length-1;
        int itr = 0;

        while(itr <= p2){
            if(arr[itr] == 0){
                swap(arr,itr++,++p1);
            }else if(arr[itr] == 2){
                swap(arr,itr,p2--);
            }else{
                itr++;
            }
         }
        for(int x : arr){
            System.out.println(x);
        }
    }

    public static int[] mergesort(int[] arr , int[] arr2){
        int n = arr.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;
        int k = 0;

        int[] ans = new int[n+m];

        while(i < n && j < m){
            if(arr[i] < arr2[j]){
                ans[k++] = arr[i++]; 
            }else{
                ans[k++] = arr2[j++];
            }
        }

        while(i < n){
            ans[k++] = arr[i++];
        }

        while(j < m){
            ans[k++] = arr2[j++];
        }

        return ans;
    }


    public static void bubblesort(int[] arr){
        for(int i = 0 ; i < arr.length;i++){
            // boolean swapedornot = false;
            for(int j = 1 ; j < arr.length-i;j++){
                if(arr[j-1] > arr[j]){
                    swap(arr,j-1,j);
                    // swapedornot = true;
                }
            }
            // if(swapedornot == true){
            //     break;
            // }   
        }   

        for(int x : arr){System.out.println(x);}
    }

    public static void selectionsort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){ 
            int minidx = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[minidx]{    
                    minidx = j;
                }
            }    
            swap(arr,i,minidx);
        }

        for(int x : arr){System.out.println(x);}

    }
    public static void insertion(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n;i++){
            for(int j = i; j > 0; j--){
                if(arr[j-1] > arr[j]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }

    public static int PartitionAnArray(int[] arr, int data) {
        int n = arr.length, p = -1, itr = 0;
        while (itr < n) {
            if (arr[itr] <= data)
                swap(arr, itr, ++p);
            itr++;
        }

        return p;
    }

    public static void PartitionOverPivot(int[] arr, int pivotIdx) {
        int n = arr.length;
        swap(arr, pivotIdx, n - 1);

        int itr = 0, p = -1, li = n - 1;
        while (itr < li) {
            if (arr[itr] <= arr[li])
                swap(arr, itr, ++p);

            itr++;
        }

        swap(arr, ++p, li);
    }
    
    public static void main(String arg[]){
        int[] arr = {5,7,4,1,2};
        selectionsort(arr);
        // System.out.println("\n");
        // selectionSortpep(arr);
        // bubblesort(arr);

        
        
        // int[] arr2 = {2,4,5};
        // int[] ans = mergesort(arr,arr2);
        // for(int x : ans){
        //     System.out.println(x);
        // }
    }
}