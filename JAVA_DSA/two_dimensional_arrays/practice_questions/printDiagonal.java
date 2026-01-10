
public class printDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 5, 4, 3 }
        };

        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
