package JAVA_DSA.pattern_printing.practiceQuestions;

import java.util.Scanner;

public class mixtureTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (i % 2 == 0)
					System.out.print((char) (64 + j) + " ");
				else
					System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}