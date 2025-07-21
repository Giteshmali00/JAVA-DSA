package LeetCode;

public class scoreAfterFlippingMatrix861 {
    public static void print2DArray(int[][] arr) {
        for (int[] ele : arr) {
            for (int sele : ele) {
                System.out.print(sele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 0, 0, 1, 1 },
                { 1, 0, 1, 0 },
                { 1, 1, 0, 0 }
        };
        int m = grid.length, n = grid[0].length;
        print2DArray(grid);
        for (int i = 0; i < m; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 1)
                        grid[i][j] = 0;
                    else
                        grid[i][j] = 1;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            int zero = 0, one = 0;
            for (int j = 0; j < m; j++) {
                if (grid[j][i] == 0)
                    zero++;
                else
                    one++;
            }
            if (zero > one) {
                for (int j = 0; j < m; j++) {
                    if (grid[j][i] == 1)
                        grid[j][i] = 0;
                    else
                        grid[j][i] = 1;
                }
            }
        }
        int score = 0;
        for (int i = m - 1; i >= 0; i--) {
            int x = 1;
            for (int j = n - 1; j >= 0; j--) {
                score += grid[i][j] * x;
                x *= 2;
            }
        }
        System.out.println(score);
        print2DArray(grid);
    }
}
