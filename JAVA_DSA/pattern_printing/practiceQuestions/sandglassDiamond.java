package JAVA_DSA.pattern_printing.practiceQuestions;

import java.util.Scanner;

public class sandglassDiamond {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();

		for (int i = 1; i <= 2 * n - 1; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				int a = i, b = j;
				if (i > n)
					a = 2 * n - i;
				if (j > n)
					b = 2 * n - j;
				if (i == n || j == n || a + b == n + 1)
					System.out.print("*" + " ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}