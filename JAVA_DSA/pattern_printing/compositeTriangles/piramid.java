package JAVA_DSA.pattern_printing.compositeTriangles;

import java.util.Scanner;

public class piramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
