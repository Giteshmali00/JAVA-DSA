package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        double r = sc.nextDouble();
        double aoc = Math.PI * r * r;
        System.out.print("Area Of Circle is : " + aoc);
    }
}
