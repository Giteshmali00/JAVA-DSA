package JAVA_DSA.pattern_printing.practiceQuestions;

import java.util.Scanner;

public class numberBridge2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();

		for (int i = 1; i <= 2 * n - 1; i++) {
			int a = i;
			if (i > n)
				a = 2 * n - i;
			System.out.print(a + " ");
		}
		System.out.println();
		n--;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n + 1 - i; j++) {
				System.out.print(j + " ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(" " + " ");
			}
			for (int j = n + 1 - i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}