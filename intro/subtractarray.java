import java.util.*;

public class subtractarray {

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[] a1  = new int[n];

        for(int i = 0; i < a1.length; i++){
            a1[i] = scr.nextInt();
        }

        int m = scr.nextInt();

        int[] a2 = new int[m];
        for(int i = 0; i < a2.length; i++){
            a2[i] = scr.nextInt();
        }
        
        int[] diff = new int[m];
        int c = 0;
        int i = a1.length-1;
        int j = a2.length-1;
        int k = diff.length-1;

        while(k >= 0){
        int d = 0 ;
        int a1v = i >= 0 ? a1[i] : 0;
            if(a2[j] + c >= a1v){
                d = a2[j] + c - a1v;
                c = 0;
            }else{
                d = a2[j] + c + 10 - a1v;
                c = -1;
            }
        
        diff[k] = d;
        i--;
        j--;
        k--;
        }

    for (int idx = 0; idx < diff.length;idx++) {
        if (idx == 0 && diff[idx] == 0)
            continue;
        System.out.print(diff[idx]);
    }
    }
    
}
