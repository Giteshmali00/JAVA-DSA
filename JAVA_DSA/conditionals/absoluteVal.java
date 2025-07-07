package JAVA_DSA.conditionals;

import java.util.Scanner;

public class absoluteVal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        if (n < 0)
            System.out.print("Absolute Value is : " + (-n));
        else
            System.out.println("Absolute Value is : " + n);
    }
}
