package JAVA_DSA.recursion;

import java.util.Scanner;

public class sumuptoN {
    public static int sumUpTo(int n) {
        if (n == 1 || n == 0)
            return n;
        return n + sumUpTo(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(sumUpTo(n));
    }
}
