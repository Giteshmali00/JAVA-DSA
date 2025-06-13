package Methods;

import java.util.Scanner;

public class areaOfACircle {
    static double areaOfCircle(int r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int r = sc.nextInt();

        double area = areaOfCircle(r);
        System.out.print("Area Of Circle with Radius " + r + " is " + area);
    }
}
