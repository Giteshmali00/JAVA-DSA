package pattern_printing.practiceQuestions;

import java.util.Scanner;

public class butterflyStar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= 2 * n - 2 * i; j++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int j = 1; j <= n * 2; j++) {
			System.out.print("* ");
		}
		System.out.println();
		for (int j = 1; j <= n * 2; j++) {
			System.out.print("* ");
		}
		System.out.println();
		for (int i = 1; i <= n - 1; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("* ");
			}
			for (int j = 1; j <= 2 * i; j++) {
				System.out.print(" " + " ");
			}
			for (int j = 1; j <= n - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}