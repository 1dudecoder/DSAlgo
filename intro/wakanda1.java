package intro;
import java.util.*;
public class wakanda1 {

    public static void main(String arg[]){
       Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int m = scr.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr[0].length ; j++){
                arr[i][j] = scr.nextInt();
            }
        }
        
        for(int j = 0; j < arr[0].length; j++){
            if(j%2 == 0){
                for(int i = 0 ; i < arr.length ; i++){
                    System.out.println(arr[i][j]);
                }
            }else{

                for(int i = arr.length-1; i >= 0 ; i--){
                    System.out.println(arr[i][j]);
                }
            }
        }

    }
   

}
