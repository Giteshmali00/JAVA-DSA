package JAVA_DSA.recursion;

import java.util.Scanner;

public class gcd {
    public static int greatestCommonDevisor(int a, int b) {
        if (b % a == 0)
            return a;
        return greatestCommonDevisor(b % a, a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print(greatestCommonDevisor(a, b));
    }
}
