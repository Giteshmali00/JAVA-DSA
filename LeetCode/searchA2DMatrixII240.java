
import java.util.Scanner;

public class searchA2DMatrixII240 {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int i = 0, j = n - 1;
        while (i < m && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                j--;
            else
                i++;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.print("Enter Target : ");
        int target = sc.nextInt();
        sc.close();
        boolean flag = searchMatrix(matrix, target);
        if (flag)
            System.out.print("Element Found..");
        else
            System.out.print("Element Not Found.");
    }
}
