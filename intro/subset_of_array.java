import java.util.*;

public class subset_of_array {

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] arr = new int[n];

        int go = (int) Math.pow(2, n);

        for(int i = 0; i < arr.length; i++){
            arr[i] = scr.nextInt();
        }

        for(int j = 0; j < go; j++){
                int temp = j;
                String set = "";
                for(int k = arr.length-1; k >= 0; k--){
                    int d = temp%2;
                    temp = temp/2;
                    if(d == 0){
                        set = "-\t" + set;
                    }else{
                        set = arr[k] + "\t" + set;
                    }
                }
                System.out.println(set);
            
        }
    }
}
