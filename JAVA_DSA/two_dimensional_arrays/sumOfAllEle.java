package JAVA_DSA.two_dimensional_arrays;

public class sumOfAllEle {
    public static void main(String[] args) {
        int[][] arr = { { 6, 8, 9 }, { 4, 8, 7 }, { 3, 2, 1 }, { 5, 7, 4 } };
        int m = arr.length;
        int n = arr[0].length;

        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[i][j];
            }
        }

        System.out.print("Summ of All Array Element = " + sum);
    }
}
