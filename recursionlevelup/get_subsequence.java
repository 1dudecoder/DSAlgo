package recursionlevelup;
import java.util.*;

public class get_subsequence {

    public static void maze_path_jumps(int row,int col,int frow,int fcol,String ans){

        if(row == frow && col == fcol){
            System.out.println(ans);
            return;
        }

        for(int i = 1; i <= fcol - col; i++){
        maze_path_jumps(row, col+i, fcol, fcol, ans + "h" + i );
        }

        for(int i = 1; i <= frow - row; i++){
            maze_path_jumps(row+i, col, frow, fcol, ans + "v" + i );
        }

        for(int i = 1; i <= frow - row && i <= fcol - col ; i++){
            maze_path_jumps(row+1, col+1, frow, fcol, ans + "d" + i );
        }

    }

    public static void maze_path(int row,int col,int frow,int fcol,String ans){

        if(row > frow || col > fcol){
            return;
        }

        if(row == frow && col == fcol){
            System.out.println(ans);
            return;
        }
        
        maze_path(row+1, col, frow, fcol, ans + "h");
        maze_path(row, col+1, frow, fcol, ans + "v");
        
    }

    public static void stairs_path(int n , String ans){
        if(n < 0){
            return;
        }
        if(n == 0){
            System.out.println(ans);
            return;
        }

        stairs_path(n-1, ans + "1");
        stairs_path(n-2, ans + "2");
        stairs_path(n-3, ans + "3");
    }

    public static void printsubseq(String str , String ans){

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char a = str.charAt(0);
        String ls = str.substring(1);

        printsubseq(ls, ans);
        printsubseq(ls, ans+a);
    }
    
    public static void kpc (String ques, String ans){  
    String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

        if(ques.length() == 0){
            System.out.println(ans);
            return ;
        }

        char ch = ques.charAt(0);
        String ls = ques.substring(1);
        String da = arr[ch - '0']; 

        for(int i = 0 ; i < da.length(); i++){
            char cho = da.charAt(i);
            kpc(ls,ans + cho);
        }
    }

    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        int n  = scr.nextInt();
        int m = scr.nextInt();
        String ans = "";
        maze_path_jumps(1,1,n,m,ans);
    }
    
}
