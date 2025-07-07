package JAVA_DSA.two_dimensional_arrays;

public class addTwoMatrices {
    public static void main(String[] args) {
        int[][] a = {
                { 2, 6, 3 },
                { 5, 2, 9 },
                { 2, 4, 5 }
        };
        int[][] b = {
                { 4, 3, 2 },
                { 4, 3, 7 },
                { 8, 3, 4 }
        };
        int m = a.length;
        int n = a[0].length;

        // Method 1.
        // int[][] add = new int[3][3];
        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++) {
        // add[i][j] = a[i][j] + b[i][j];
        // }
        // }

        // for (int[] ele : add) {
        // for (int sele : ele) {
        // System.out.print(sele + " ");
        // }
        // System.out.println();
        // }

        // Method 2. Without Using Extra Array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
