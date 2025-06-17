package methods;

import java.util.Scanner;

public class squaresOfNNaturalNumbers {
    static void squares(int n) {
        System.out.println("Square of Natural Numbers up to " + n);
        for (int i = 1; i <= n; i++) {
            System.out.println(i + " = " + i * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number n : ");
        int n = sc.nextInt();
        squares(n);

    }
}
