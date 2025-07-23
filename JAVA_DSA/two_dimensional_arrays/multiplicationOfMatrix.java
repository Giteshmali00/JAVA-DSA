package JAVA_DSA.two_dimensional_arrays;

public class multiplicationOfMatrix {
    public static void printMatrix(int[][] arr) {
        for (int[] ele : arr) {
            for (int sele : ele) {
                System.out.print(sele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] a = {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 9, 2, 5 },
                { 9, 2, 5 }
        };
        int[][] b = {
                { 5, 8, 9 },
                { 6, 9, 3 },
                { 3, 8, 9 }
        };

        if (a[0].length != b.length) {
            System.out.print("Multiplication Not Possible..!");
        } else {
            int[][] ans = new int[a.length][b[0].length];
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        ans[i][j] += a[i][k] * b[k][j];
                    }
                }

            }
            printMatrix(ans);
        }
    }
}
