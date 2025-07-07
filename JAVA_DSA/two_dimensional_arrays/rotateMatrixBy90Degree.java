package JAVA_DSA.two_dimensional_arrays;

public class rotateMatrixBy90Degree {
    public static void main(String[] args) {
        int[][] arr = {
                { 3, 1, 2, 5 }, // 3,8,5,11//11,5,8,3//a00<->a03, a01<->a02
                { 8, 7, 9, 6 }, // 1,7,4,7//7,4,7,1//a10<->a13, a11<->a12
                { 5, 4, 6, 7 }, // 2,9,6,5//5,6,9,2//a20<->a23, a21<->a22
                { 11, 7, 5, 2 } // 5,6,7,2//2,7,6,5//a30<->a33, a31<->a32
        };

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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
