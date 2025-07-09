package JAVA_DSA.two_dimensional_arrays;

public class wavePrint {
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
        int[][] arr = {
                { 12, 44, 32 },
                { 22, 88, 99 },
                { 79, 90, 76 }
        };

        int m = arr.length;
        int n = arr[0].length;
        print2DArray(arr);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.print(arr[i][n - 1 - j] + " ");
            }
            System.out.print(" ");
        }
    }
}
