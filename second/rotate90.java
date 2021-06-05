package second;

import java.util.*;
public class rotate90 {

 public static void main(String arg[]){
     Scanner scr = new Scanner(System.in);

     int n = scr.nextInt();
     int[][] arr = new int[n][n];

    for(int i = 0 ; i < arr.length ; i++){
        for(int j = 0 ; j < arr[0].length; j++){
            arr[i][j] = scr.nextInt();
        }
    }

    //transpose
    for(int i = 0 ; i < arr.length; i++){
        for(int j = i; j < arr[0].length;j++){
            int temp = arr[i][j];
            arr[i][j] = arr[j][i];
            arr[j][i] = temp;
        }
    }

    //rotate front to backwords

    for(int i = 0; i < arr.length; i++){
        int lo = 0;
        int hi = arr.length-1;
        
        while(lo < hi){
            int temp = arr[i][lo];
            arr[i][lo] = arr[i][hi];
            arr[i][hi] = temp;
            lo++;
            hi--;
        }
    }

    for(int i = 0 ; i < arr.length ; i++){
        for(int j = 0 ; j < arr[0].length; j++){
            System.out.println(arr[i][j]);
        }
    }
}
}