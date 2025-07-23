package JAVA_DSA.two_dimensional_arrays.practice_questions;

public class eleOfMiddleRowAndCol {
    public static void middle(int[][] arr) {
        int m = arr.length, n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n / 2 || i == m / 2) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, -3, 4, 4 },
                { 0, 0, -4, 2, 9 },
                { 1, -1, 2, 3, 8 },
                { -4, -5, -7, 0, 5 },
                { -4, -5, -7, 0, 7 }
        };

        middle(arr);
    }
}
