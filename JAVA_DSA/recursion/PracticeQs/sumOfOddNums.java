package JAVA_DSA.recursion.PracticeQs;

import java.util.Scanner;

public class sumOfOddNums {
    public static int sumOdd(int a, int b) {
        if (a >= b) {
            if (b % 2 == 0)
                return 0;
            else
                return b;
        }

        if (a % 2 != 0)
            return a + sumOdd(a + 2, b);
        else
            return sumOdd(a + 1, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        int sum = sumOdd(a, b);
        System.out.println(sum);
    }
}