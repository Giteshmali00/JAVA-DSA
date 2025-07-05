package two_dimensional_arrays;

import java.util.Scanner;

public class storeMarksAndRollNumber {
    public static void main(String[] args) {
        int[][] arr = new int[4][2];
        int m = arr.length;
        int n = arr[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks and Roll Number : ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int[] ele : arr) {
            for (int x : ele) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
