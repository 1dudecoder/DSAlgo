public class quickselect {

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int segrigate(int[] arr, int si ,int ei, int pvt){
        swap(arr,pvt,ei);
        int itr = si;
        int p = si-1;

        while(itr <= ei){
            if( arr[itr] <= arr[ei] ) {

                swap(arr,++p,itr);
            }
            itr++;
        }
        return p;
    }

    public static void orignalquickselect(int[] arr, int si ,int ei, int idx){
        if(si > ei){
            return;
        }
        int pvt = ei;
        int p = segrigate(arr,si,ei,pvt);

        if(p == idx){
            return;
        }else if(p < idx){
            orignalquickselect(arr, p+1, ei, idx);
        }else{
            orignalquickselect(arr, si, p-1, idx);
        }
    }

    public static int kthpalace(int[] arr,int idx){
        int n = arr.length;
        
        orignalquickselect(arr,0,n-1,idx);

        return arr[idx];
    }
    
    public static void main(String arg[]){
        int[] arr =  {8,2,7,4,3,5,1,6};
        int k = 0;
        int ans = kthpalace(arr,k);
        
        for(int x : arr){
            System.out.print(x + " ");
        }

        System.err.println();

        System.out.println(ans);
    }

}
