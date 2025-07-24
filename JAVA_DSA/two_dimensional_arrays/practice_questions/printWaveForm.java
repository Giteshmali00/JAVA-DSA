package JAVA_DSA.two_dimensional_arrays.practice_questions;

public class printWaveForm {
    public static void main(String[] args) {
        int[][] matrix = {
                { -1, -2, -3, -4 },
                { 0, 0, -4, 2 },
                { 1, -1, 2, -3 },
                { -4, -5, -7, 0 }
        };

        int m = matrix.length, n = matrix[0].length;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = m - 1; j >= 0; j--)
                    System.out.print(matrix[j][i] + " ");
            } else {
                for (int j = 0; j < m; j++)
                    System.out.print(matrix[j][i] + " ");
            }
        }
    }
}
