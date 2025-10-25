package JAVA_DSA.recursion;

import java.util.Scanner;

public class aRaisedToPwerBUsingBinary {
    // Bakwas Method---------------TC = O(b)
    // public static int powern(int a, int b) {
    // if (b == 0)
    // return 1;
    // return a * powern(a, b - 1);
    // }

    // Main Method-------------------TC = O(log b)This is much much better than
    // powern()
    public static int powerLogn(int a, int b) {
        if (b == 0)
            return 1;
        int ans = powerLogn(a, b / 2);
        if (b % 2 == 0)
            return ans * ans;
        else
            return ans * ans * a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        // System.out.println(powern(a, b));
        System.out.println(powerLogn(a, b));
    }
}
