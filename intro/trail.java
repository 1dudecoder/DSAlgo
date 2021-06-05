import java.util.*;

public class trail {

    public static void main(String arg[]){

        Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        int[] arr1 = new int[n];
        for(int i = 0 ; i <= arr1.length-1 ; i++){
            arr1[i] = scr.nextInt();
        }      

        int n2 = scr.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0 ; i <= arr2.length-1 ; i++){
            arr2[i] = scr.nextInt();
        }

        sumOfTwoArray(arr1, arr2);

    }
    public static void sumOfTwoArray(int[] arr1, int[] arr2) {

        int n = arr1.length;
        int m = arr2.length;
        int p = Math.max(n, m) + 1;
        int[] ans = new int[p];

        int i = n - 1, j = m - 1, k = p - 1, carry = 0;
        while (k >= 0) {
            int sum = carry + (i >= 0 ? arr1[i] : 0) + (j >= 0 ? arr2[j] : 0);
            ans[k] = sum % 10;
            carry = sum / 10;

            i--;
            j--;
            k--;
        }

        for (int idx = 0; idx < p; idx++) {
            if (idx == 0 && ans[idx] == 0)
                continue;
            System.out.print(ans[idx]);
        }
    }


}

