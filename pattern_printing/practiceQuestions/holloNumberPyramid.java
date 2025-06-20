package pattern_printing.practiceQuestions;

import java.util.Scanner;

public class holloNumberPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= 2 * n - 1; j++) {
				int a = j;
				if(j>n) a = 2*n-j;
				if (a+i==n+1)
					System.out.print(i+" ");
				else
					System.out.print(" " + " ");
			}
			System.out.println();
		}
	}
}