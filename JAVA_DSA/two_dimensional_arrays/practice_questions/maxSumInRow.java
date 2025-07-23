package JAVA_DSA.two_dimensional_arrays.practice_questions;

public class maxSumInRow {
    public static void main(String[] args) {
        int[][] arr = {
                { -1, -2, -3, -4 },
                { 0, 0, -4, 2 },
                { 1, -1, 2, -3 },
                { -4, -5, -7, 0 }
        };
        int m = arr.length, n = arr[0].length;

        int maxSR = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            int privMaxSum = 0;
            for (int j = 0; j < n; j++) {
                privMaxSum += arr[i][j];
            }
            if (privMaxSum >= maxSum) {
                maxSum = privMaxSum;
                maxSR = i;
            }
        }
        System.out.print(maxSR);
    }
}
