package myarray;
import java.util.*;
public class removearr {

    public static void swap(int i, int j, ArrayList<Integer> arr){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j,temp);
    }

    public static boolean isprime(int a){

        if(a == 1){
            return false;
        }

        for(int i = 2; i * i <= a ; i++){
            if( a % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();

        // System.out.println(isprime(15));

        int n = scr.nextInt();

        for(int i = 0; i < n; i++){
            arr.add(scr.nextInt());
        }

        for(int i = 0 ; i < arr.size(); i++){
            int a = arr.get(i);
            boolean tell = isprime(a);

            if(tell == false){
                arr2.add(a);
        }
    }

    System.out.println(arr2);

}

}