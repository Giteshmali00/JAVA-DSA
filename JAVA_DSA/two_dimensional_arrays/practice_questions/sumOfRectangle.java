package JAVA_DSA.two_dimensional_arrays.practice_questions;

public class sumOfRectangle {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, -3, 4 },
                { 0, 0, -4, 2 },
                { 1, -1, 2, 3 },
                { -4, -5, -7, 0 }
        };
        int m = arr.length, n = arr[0].length;
        int l1 = 1, r1 = 0, l2 = 0, r2 = 3;

        int ans = 0;
        for (int i = Math.min(l1, l2); i <= Math.max(l1, l2); i++) {
            for (int j = Math.min(r1, r2); j <= Math.max(r1, r2); j++) {
                ans += arr[i][j];
            }
        }
        System.out.println(ans);

    }
}
