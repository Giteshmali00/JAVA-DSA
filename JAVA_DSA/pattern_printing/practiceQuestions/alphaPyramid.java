package JAVA_DSA.pattern_printing.practiceQuestions;

import java.util.Scanner;

public class alphaPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i - 1; j++) {
				System.out.print((char) (64 + i - j + 1) + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print((char) (64 + j) + " ");
			}
			System.out.println();
		}
	}
}