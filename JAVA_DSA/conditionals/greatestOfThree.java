package JAVA_DSA.conditionals;

import java.util.Scanner;

public class greatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c)
                System.out.print(a + " is Greatest.");
            else
                System.out.print(c + " is Greatest.");
        } else {
            if (b > c)
                System.out.print(b + " is Greatest.");
            else
                System.out.print(c + " is Greatest.");
        }

    }
}
