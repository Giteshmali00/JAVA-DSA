package JAVA_DSA.recursion;

import java.util.Scanner;

public class binaryStrings {
    public static void bStrings(int n, String str) {
        int len = str.length();
        if (len == n) {
            System.out.print(str + " ");
            return;
        }
        bStrings(n, str + 0);
        if (len == 0 || str.charAt(len - 1) == '0') {
            bStrings(n, str + 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        bStrings(n, "");
    }
}
