package JAVA_DSA.pattern_printing.practiceQuestions;

import java.util.Scanner;

public class instaQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();

        int temp = 1;
        for (int i = 0; i < n; i++) {
            int ap = temp;
            for (int j = 0; j <= i; j++) {
                System.out.print(ap + " ");
                ap = ap - (n - i + j);
            }
            temp = temp + n - i;
            System.out.println();
        }
    }
}
