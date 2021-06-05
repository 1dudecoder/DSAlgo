package recursionlevelup;

import java.util.*;

public class mazepathset1 {

    public static int rat_in_maze_backtracking(int r, int c, int[][] board, String ans, int[][] dir, String[] dirsate) {
        int count = 0;

        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(ans);
            return 1;
        }

        board[r][c] = 1;
        for (int i = 0; i < dir.length; i++) {
            int row = r + dir[i][0];
            int col = c + dir[i][1];

            if (row >= 0 && col >= 0 && row <= board.length - 1 && col <= board[0].length - 1 && board[row][col] == 0) {
                count += rat_in_maze_backtracking(row, col, board, ans + board[row][col], dir, dirsate);
            }

        }
        board[r][c] = 0;
        return count;
    }

    public static void main(String arg[]) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int m = scr.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scr.nextInt();
            }
        }

        int[][] dir = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
        String[] dirsate = { "t", "r", "d", "l" };
        int count = rat_in_maze_backtracking(0, 0, arr, "", dir, dirsate);

    }

}
