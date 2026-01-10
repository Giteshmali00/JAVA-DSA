
import java.util.Scanner;

public class starTriangleFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        // Method 1 -->
        // for (int i = 1; i <= n; i++) {
        // for (int k = 1; k <= n - i + 1; k++) {
        // System.out.print(" " + " ");
        // }
        // for (int j = n - i + 1; j <= n; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // Method 2 -->
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n) {
                    System.out.print("* ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
