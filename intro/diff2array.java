import java.io.*;
import java.util.*;

public class diff2array {

    
    public static void main(String[] args) throws Exception {
        
        Scanner scr = new Scanner(System.in);
        
        int n1 = scr.nextInt();
        
        int[] a1 = new int[n1];
        
        for(int i = 0; i < a1.length; i++){
            
            a1[i] = scr.nextInt();
            
        }
        
        
        int n2 = scr.nextInt();
        
        int[] a2 = new int[n2];
        
        for(int i = 0; i < a2.length; i++){
            
            a2[i] = scr.nextInt();
            
        }
        
        
        int[] sum = new int[n2];
        
        int c = 0;
        
        int i = a1.length-1;
        int j = a2.length-1; 
        int k = sum.length-1;
        
            while(k>=0){
                
              int d = 0;
        
            int val = i >= 0 ? a1[i] : 0;
        
          if(a2[j] + c >= val){
              d = (a2[j] + c ) - val;
              c = 0;
          }else{
              d = (a2[j] + c + 10 ) - val;
              c = -1;
          }
          
          sum[k] = d;
          
          i--;
          j--;
          k--;
             
        }
        
        
        int d = 0;
        
        while(d < sum.length){
            
            if(sum[d] == 0){
                
                d++;
                
            }else{
                
                break;
            }
    
            
        }
        
          while(d < sum.length){
            System.out.println(sum[d]);
            d++;
        }
     
        
     }
    
    }

