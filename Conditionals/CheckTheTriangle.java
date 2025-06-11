package Conditionals;

import java.util.Scanner;

public class CheckTheTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Side : ");
        int s1 = sc.nextInt();
        System.out.print("Enter 2nd Side : ");
        int s2 = sc.nextInt();
        System.out.print("Enter 3rd Side : ");
        int s3 = sc.nextInt();

        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            if (s1 == s2 && s2 == s3)
                System.out.println("Equilateral Triangle");
            else if (s1 == s2 || s2 == s3 || s3 == s1) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Not a valid triangle");
        }
    }
}