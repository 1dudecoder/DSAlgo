package recursionlevelup;
import java.util.*;
public class longestpathmaze {
    
    public static int longpath(int r,int c, int[][] board, String ans, int[][] dir, String[] dirs){

        if(r == board.length-1 && c == board[0].length-1){
            System.out.println(ans);
            return 1;
        }

        board[r][c] = 1;

        int count = 0;
        for(int i = 0 ; i < dir.length; i++){
            int row  = r + dir[i][0];
            int col = c + dir[i][1];

            if(row >= 0 && col >= 0 && row <= board.length-1 && col <= board[0].length-1 && board[row][col] == 0){
               count += longpath(row,col,board,ans+dirs[i],dir,dirs);
            }
        }

        board[r][c] = 0;
        return count;
    }
    
    public static void main(String arg[]){
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < arr.length;i++){
            for(int j = 0 ; j < arr[0].length; j++){
                arr[i][j] = scr.nextInt();
            }
        }

        int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
        String[] dirs = {"t","r","d","l"};

        int count = longpath(0,0,arr,"",dir,dirs);

    }
}
