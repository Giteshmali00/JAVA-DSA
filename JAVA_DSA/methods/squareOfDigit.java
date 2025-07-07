package JAVA_DSA.methods;

import java.util.Scanner;

public class squareOfDigit {

    static void squareDigit(int n) {
        int temp = n, count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        System.out.println("Digit = " + count);
        System.out.println("Square of " + n + " = " + n * n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        squareDigit(n);
    }
}
