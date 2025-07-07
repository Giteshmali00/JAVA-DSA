package JAVA_DSA.loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Which Number of Table you Wants to Print? : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i);
        }
    }
}
