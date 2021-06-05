import java.io.*;
import java.util.*;

public class buffer {

      public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }
    
      public static int[] reverse(int[] arr){
          
            int a = 0;
            
            int[] arr2 = new int[arr.length];
            
            for(int i = arr.length-1; i >= 0; i--){
              arr2[a] = arr[i];
              a++;
            }
            return arr2;
      }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
    
        reverse(a);
        display(a);
     }
    
    }

