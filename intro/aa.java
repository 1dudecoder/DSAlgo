import java.util.*;
  
  public class aa{

    public static Scanner scr = new Scanner(System.in);

      public static int maximum(int[] arr){
        int max = -(int) 1e9;
        for(int i = 0; i <= arr.length-1; i++){
           if(arr[i] > max){
             max = arr[i];
           }
        }
        return max;
      }
  
      public static int minimum(int[] arr){
        int min = (int) 1e9;
        for(int i = 0; i <= arr.length-1; i++){
           if(arr[i] < min){
             min = arr[i];
           }
        }
        return min;
      }
  
      // if you found return index, otherwise return -1.
      public static int find(int[] arr,int data){               
        int find = -1;
        for(int i = 0; i <= arr.length-1; i++){
           if(arr[i] == data){
             find = i;
             break;
           }
        }
        return find;
      }

      public static int[] inverse(int[] arr){
        int a = 0;
        int[] arr2 = new int[arr.length];
        for(int i = arr.length-1; i >= 0; i--){
          arr2[i] = arr[a];
          a++;
        }
        return arr2;
      }

      public static int[] indextoarray(int[] arr){

        int[] arr2 = new int[arr.length];
        for(int i = 0; i <= arr.length-1; i++){
           int a = arr[i];
          arr2[a] = i;
        }
        return arr2;
      }
      

      public static int[] input(int n){
        int[] arr = new int[n];
        for(int i = 0; i <= arr.length-1;i++){
          arr[i] = scr.nextInt();
        }
        return arr;
      }

      public static void main(String[] args) {

        int n = scr.nextInt();
        int[] arr = input(n);

         int a =  minimum(arr);
         int b = maximum(arr);

         System.out.println(b-a);

      }
  }



