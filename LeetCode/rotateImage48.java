package LeetCode;

public class rotateImage48 {
    public static void printMatrix(int[][] arr) {
        for (int[] ele : arr) {
            for (int sele : ele) {
                System.out.print(sele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rotateBy90Degree(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][n - 1 - j];
                arr[i][n - 1 - j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 3, 1, 2, 5 }, // 3,8,5,11 //11,5,8,3 //a[0][0]<->a[0][3], a[0][1]<->a[0][2]
                { 8, 7, 9, 6 }, // 1,7,4,7 //7,4,7,1 //a[1][0]<->a[1][3], a[1][1]<->a[1][2]
                { 5, 4, 6, 7 }, // 2,9,6,5 //5,6,9,2 //a[2][0]<->a[2][3], a[2][1]<->a[2][2]
                { 11, 7, 5, 2 } // 5,6,7,2 //2,7,6,5 //a[3][0]<->a[3][3], a[3][1]<->a[3][2]
        };
        printMatrix(arr);
        rotateBy90Degree(arr);
        printMatrix(arr);
    }
}
