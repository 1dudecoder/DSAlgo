package second;
import java.util.*;

public class saddle {
    public static void main(String arg[]){
    Scanner scr = new Scanner(System.in);

    int n = scr.nextInt();
    int[][] arr = new int[n][n];

   for(int i = 0 ; i < arr.length ; i++){
       for(int j = 0 ; j < arr[0].length; j++){
           arr[i][j] = scr.nextInt();
       }
   }

   int sm = 0; //cheacking the smallest element in a row
   for(int i = 0 ; i < arr.length ; i++){
    for(int j = 0 ; j < arr[0].length; j++){  
        
        if(arr[i][j] < arr[i][sm]){
            sm = j; 

        }
    }

    boolean flag = true;
    //cheaking higest element in a row if it is small one then it is saddle point
    for(int k = 0; k < arr.length; k++){
        if(arr[k][sm] > arr[i][sm]){
            flag = false;
            break;
        }
    }

    if(flag == true){
        System.out.println(arr[i][sm]);
        return;
    }
}
System.out.println("Invalid input");
}
}
