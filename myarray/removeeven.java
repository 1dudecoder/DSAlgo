
package myarray;
import java.util.*;
public class removeeven {

    public static void swap(int i, int j, ArrayList<Integer> arr){
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j,temp);
    }

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<Integer>();

        int n = scr.nextInt();

        for(int i = 0; i < n; i++){
            arr.add(scr.nextInt());
        }

        int i = arr.size()-1;
        while(i != 0){
            int j = arr.size()-1;
            int a = arr.get(i);
            boolean tell = isprime(a);
            if(a == true){
                swap(i,j,arr);
                arr.remove(j);
                i--;
            } else{
                i--;
            }
        }

        System.out.println(arr);
    }
    
}

