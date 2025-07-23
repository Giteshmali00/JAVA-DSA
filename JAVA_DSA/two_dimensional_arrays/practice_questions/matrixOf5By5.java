package JAVA_DSA.two_dimensional_arrays.practice_questions;

public class matrixOf5By5 {
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
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 10;
            }
        }
        printMatrix(matrix);
    }
}
