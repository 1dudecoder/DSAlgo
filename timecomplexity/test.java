public class test {

    
    public static void swap(int[] arr, int itr, int pvt ){
        int temp = arr[itr];
        arr[itr] = arr[pvt];
        arr[pvt] = temp;
    }
    
    public static void selectionsort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){ 
            int minidx = i;
            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[minidx]){    
                    minidx = j;
                }
            }    
            swap(arr,i,minidx);
        }

        for(int x : arr){
            System.out.println(x);
        }

    }

    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            swap(arr,index,i);
        }  
        
        for(int x : arr){
            System.out.println(x);
        }
    }  




    public static void main(String  arg[]){
        int[] arr = {1,3,4,56,7,2,76,2,0,4};
        selectionSort(arr);

    }
    
}
