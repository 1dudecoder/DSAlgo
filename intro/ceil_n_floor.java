package intro;
import java.util.*;

public class ceil_n_floor {

    public static Scanner scr = new Scanner(System.in);
    public static void main(String arg[]){
        int n = scr.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length;i++){
            arr[i] = scr.nextInt();
        }

        int t = scr.nextInt();

        int i = 0;
        int j = arr.length-1;

        int ceil = 0;
        int floor = 0;

        while(i <= j){

            int mid  = (i + j)/2;
            if(t > arr[mid]){
                i = mid + 1;
                floor = arr[mid];

            }else if (t < arr[mid]){
                j = mid - 1;
                ceil = arr[mid];

            }else{
                ceil = arr[mid+1];
                floor = arr[mid-1];
                break;
                
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
