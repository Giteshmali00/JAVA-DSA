package JAVA_DSA.recursion.PracticeQs;

import java.util.Scanner;

public class checkForPowerOfTwo {
    public static boolean checkSqr(int n) {
        if (n == 1)
            return true;
        if (n % 2 != 0 || n == 0)
            return false;
        return checkSqr(n / 2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.print(checkSqr(n));
    }
}
