package JAVA_DSA.two_dimensional_arrays.practice_questions;

public class addTwoMatrices {
    public static void printMatrix(int[][] matrix) {
        for (int[] ele : matrix) {
            for (int sele : ele) {
                System.out.print(sele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void addMatrix(int[][] a, int[][] b) {
        if ((a.length != b.length) || (a[0].length != b[0].length)) {
            System.out.print("Both Matrices rows and Columns Must be Same.");
            return;
        } else {
            int m = a.length, n = a[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = a[i][j] + b[i][j];
                }
            }
        }
        printMatrix(a);

    }

    public static void main(String[] args) {
        int[][] a = {
                { 3, 4, 8 },
                { 9, 4, 5 },
                { 3, 9, 6 },
        };
        int[][] b = {
                { 4, 5, 9 },
                { 8, 5, 6 },
                { 4, 8, 7 },
        };
        addMatrix(a, b);

    }
}
