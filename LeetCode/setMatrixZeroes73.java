package LeetCode;

public class setMatrixZeroes73 {
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
        int[][] arr = {
                { 0, 44, 87, 0 },
                { 42, 73, 88, 32 },
                { 45, 55, 78, 3 },
                { 22, 4, 9, 56 }
        };
        int m = arr.length, n = arr[0].length;
        boolean zRow = false;
        boolean zCol = false;
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                zCol = true;
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[0][i] == 0) {
                zRow = true;
                break;
            }
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if (arr[0][i] == 0) {
                for (int j = 1; j < m; j++) {
                    arr[j][i] = 0;
                }
            }
        }
        if (zRow) {
            for (int i = 0; i < n; i++) {
                arr[0][i] = 0;
            }
        }
        if (zCol) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
        printMatrix(arr);
    }
}
