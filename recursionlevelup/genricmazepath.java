package recursionlevelup;

import java.util.*;

public class genricmazepath {

    // public static int maze(int r, int c, int maxr, int maxc, String ans, int[][]
    // dir, String[] dirs ) {

    // if(r == maxr && c == maxc){
    // // System.out.println(ans);
    // return 1;
    // }

    // int count = 0;
    // for(int i = 0 ; i < dir.length; i++){
    // int row = r + dir[i][0];
    // int col = c + dir[i][1];

    // if(row >= 0 && row <= maxr && col >= 0 && col <= maxc){
    // count += maze(row, col, maxr, maxc, ans + dirs[i], dir, dirs);
    // }
    // }
    // return count;
    // }

    public static int floodfill(int r, int c, int[][] board, String ans, int[][] dir, String[] dirs) {

        int n = board.length, m = board[0].length;
        if (r == n - 1 && c == m - 1) {
            System.out.println(ans);
            return 1;
        }

        board[r][c] = 1;

        int count = 0;
        for (int i = 0; i < dir.length; i++) {
            int row = r + dir[i][0];
            int col = c + dir[i][1];

            if (row >= 0 && row < board.length && col >= 0 && col < board[0].length && board[row][col] == 0){
                count += floodfill(row, col, board, ans + dirs[i], dir, dirs);
            }
        }

        board[r][c] = 0;

        return count;
    }



    

    public static void main(String arg[]) {

        // int[][] dir = {{-1,0},{0,1},{1,0},{0,-1}};
        // String[] dirstate = {"t","r","d","l"};

        // int count = maze(0, 0, 2, 2, "", dir, dirstate);
        // System.out.println(count); // for maze path

// https://www.geeksforgeeks.org/rat-in-a-maze-backtracking-2/
// https://www.geeksforgeeks.org/count-number-ways-reach-destination-maze/
// https://www.geeksforgeeks.org/rat-in-a-maze-with-multiple-steps-jump-allowed/
// https://www.geeksforgeeks.org/rat-in-a-maze-problem-when-movement-in-all-possible-directions-is-allowed/?ref=rp

        int[][] dir = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
        String[] dirstate = { "t", "r", "d", "l" };
        int[][] board = new int[3][3];

        int count = floodfill(0, 0, board, "", dir, dirstate);
        System.out.println(count); 
    }
}
