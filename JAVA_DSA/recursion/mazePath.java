package JAVA_DSA.recursion;

import java.util.Scanner;

public class mazePath {

    // Method 1. 4 parameters
    // public static int maze(int row, int col, int n, int m) {

    // if (col == n || row == m)
    // return 1;
    // int downWays = maze(row + 1, col, n, m);
    // int rightWays = maze(row, col + 1, n, m);

    // return downWays + rightWays;
    // }

    // Method 2. 2 parameters
    public static int maze(int n, int m) {

        if (1 == n || 1 == m)
            return 1;
        int downWays = maze(n - 1, m);
        int rightWays = maze(n, m - 1);

        return downWays + rightWays;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter m : ");
        int m = sc.nextInt();
        // System.out.println(powern(a, b));
        System.out.println(maze(n, m));
    }
}
