package two_dimensional_arrays;

public class findMaxVal {
    public static void main(String[] args) {
        int[][] arr = { { 23, 45, 77 }, { 88, 98, 66 }, { 89, 900, 67 } };
        int mx = Integer.MIN_VALUE;

        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] > mx) {
                    mx = arr[i][j];
                }
            }
        }
        System.out.print("Max Value = " + mx);
    }
}
