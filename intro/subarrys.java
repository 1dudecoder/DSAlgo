import java.util.*;
public class subarrys {
    public static void subarry(String[] arr){
        for(int i = 1 ; i < arr.length;i++){
            for(int j = i; j < arr.length; j++){
                for(int k = i ; k <= j; k++){
                    System.out.print(arr[k] + "\t");
                }
                System.out.println();
            }
        }

    }

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        String[] arr = new String[n+1];

        for(int i = 0; i < arr.length;i++){
            arr[i] = scr.nextLine();
        }
        subarry(arr);
    }
}
