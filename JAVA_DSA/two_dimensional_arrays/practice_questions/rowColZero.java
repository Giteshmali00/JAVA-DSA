package JAVA_DSA.two_dimensional_arrays.practice_questions;

public class rowColZero {
    public static void printMatrix(int[][] matrix) {
        for (int[] ele : matrix) {
            for (int sele : ele) {
                System.out.print(sele + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 4, 6, 0 },
                { 3, 5, 2, 1 },
                { 3, 5, 5, 4 },
                { 6, 7, 3, 5 }
        };
        int m = matrix.length, n = matrix[0].length;
        boolean[] zRow = new boolean[m];
        boolean[] zCol = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zRow[i] = true;
                    zCol[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (zCol[i]) {
                for (int j = 0; j < m; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            if (zRow[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        printMatrix(matrix);
    }
}
