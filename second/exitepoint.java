package second;
import java.util.*;
public class exitepoint {

public static Scanner s = new Scanner(System.in);

    public static void display(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int i = 0, j = 0;
        int direction = 0;
        while (true) {
            direction = (direction + arr[i][j]) % 4;
            if (direction == 0) {
                j++;
                if (j == row) {
                    System.out.println(i + "\n" + (j - 1));
                    break;
                }
            } else if (direction == 1) {
                i++;
                if (i == col) {
                    System.out.println((i - 1) + "\n" + (j));
                    break;
                }
            } else if (direction == 2) {
                j--;
                if (j == -1) {
                    System.out.println((i) + "\n" + (j + 1));
                    break;
                }
            } else {
                i--;
                if (i == -1) {
                    System.out.println((i + 1) + "\n" + (j));
                    break;
                }
            }
        }

    }

    public static void main(String args[]) {

        int[][] arr = new int[s.nextInt()][s.nextInt()];
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        display(arr);
    }
}
}
