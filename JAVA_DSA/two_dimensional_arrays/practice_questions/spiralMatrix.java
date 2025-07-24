package JAVA_DSA.two_dimensional_arrays.practice_questions;

import java.util.Scanner;

public class spiralMatrix {
    public static void printMatrix(int[][] matrix) {
        for (int[] ele : matrix) {
            for (int sele : ele) {
                System.out.print(sele + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size N : ");
        int n = sc.nextInt();
        int lowR = 0, hiR = n - 1, lowC = 0, hiC = n - 1;
        int[][] ans = new int[n][n];
        int ele = 1;
        while (lowR <= hiR || lowC <= hiC) {
            for (int j = lowC; j <= hiC; j++)
                ans[lowR][j] = ele++;
            lowR++;
            if (lowR > hiR || lowC > hiC)
                break;
            for (int j = lowR; j <= hiR; j++)
                ans[j][hiC] = ele++;
            hiC--;
            if (lowR > hiR || lowC > hiC)
                break;
            for (int j = hiC; j >= lowC; j--)
                ans[hiR][j] = ele++;
            hiR--;
            if (lowR > hiR || lowC > hiC)
                break;
            for (int j = hiR; j >= lowR; j--)
                ans[j][lowC] = ele++;
            lowC++;
        }
        printMatrix(ans);
    }
}
