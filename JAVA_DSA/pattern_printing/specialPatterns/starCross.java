package JAVA_DSA.pattern_printing.specialPatterns;

import java.util.Scanner;

public class starCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == i || i + j == n + 17) {
                    System.out.print("* ");
                } else
                    System.out.print(" " + " ");
            }
            System.out.println();
        }
    }
}
