package JAVA_DSA.pattern_printing.practiceQuestions;

import java.util.Scanner;

public class numberBridge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();

		for (int i = 1; i <= 2 * n - 1; i++) {
			System.out.print((char) (64 + i) + " ");
		}
		System.out.println();
		n--;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + 1 - i; j++) {
				System.out.print((char) (64 + j) + " ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(" " + " ");
			}
			for (int j = n + i + 1; j <= 2 * n + 1; j++) {
				System.out.print((char) (64 + j) + " ");
			}
			System.out.println();
		}
	}
}