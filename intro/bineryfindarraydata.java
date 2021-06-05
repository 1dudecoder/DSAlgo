import java.util.*;
public class bineryfindarraydata {

    public static void find_data(int[] arr , int target){

        int i = 0;
        int j = arr.length-1;
        int first = 0;
        int last = 0;

        while(i <= j){
            if(arr[i] == target){
                first = i;
            }
            if(arr[j] == target){
                last = j;
            }
            i++;
            j--;
        }

        System.out.println("first index is " + first + " last index is " + last);

    }

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < arr.length;i++){
            arr[i] = scr.nextInt();
        }
        int target = scr.nextInt();

        find_data(arr,target);
    }
}
