package second;
import java.util.*;
public class spiral {

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int m = scr.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length;i++){
            for(int j = 0 ; j < arr[0].length;j++){
                arr[i][j] = scr.nextInt();
            }
        }

        int minr = 0;
        int minc = 0;
        int maxr = arr.length-1;
        int maxc =  arr[0].length-1;
        int num = n * m ;
        int count = 0;

        while(count < num){

            for(int i = minr , j = minc; i <= maxr && count < num ; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;


            for(int i = maxr , j = minc; j <= maxc && count < num ; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            
            for(int i = maxr , j = maxc; i >= minr && count < num ; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

            for(int i = minr , j = maxc; j >= minc && count < num ; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }

        }
    }
    
