package JAVA_DSA.recursion;

import java.util.Scanner;

public class printOnetoN {

    // Method 1. Using extra variable------------

    // public static void print(int n, int x) {
    // System.out.println(n);
    // if (n == x)
    // return;
    // print(n + 1, x);
    // }

    // Method 2. Using global variable------------

    // static int n;
    // public static void print(int x) {
    // System.out.println(x);
    // if (x == n)
    // return;
    // print(x + 1);
    // }

    // Method 3. Using After call-------------Main, better

    public static void print(int n) {
        if (n == 0)
            return;
        print(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        print(n);
    }
}