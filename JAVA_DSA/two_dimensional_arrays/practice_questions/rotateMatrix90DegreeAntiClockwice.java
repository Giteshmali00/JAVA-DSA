
public class rotateMatrix90DegreeAntiClockwice {
    public static void printMatrix(int[][] arr) {
        for (int[] ele : arr) {
            for (int sele : ele) {
                System.out.print(sele + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 8, 7, 6, 5 },
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 4, 3, 2, 1 }
        };
        int m = matrix.length, n = matrix[0].length;

        for (int i = 1; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                swap(matrix, i, j);
            }
        }
        for (int i = 0; i < m / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[m - i - 1][j];
                matrix[m - i - 1][j] = temp;
            }
        }
        printMatrix(matrix);
    }
}
