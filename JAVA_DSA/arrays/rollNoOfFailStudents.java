package JAVA_DSA.arrays;

import java.util.Scanner;

public class rollNoOfFailStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students : ");
        int n = sc.nextInt();

        int[] student = new int[n];

        System.out.print("Enter Marks of the students Seperated with spaces : ");
        for (int i = 0; i < n; i++) {
            student[i] = sc.nextInt();
        }

        System.out.print("Roll Number of Failed Students : ");
        for (int i = 0; i < n; i++) {
            if (student[i] < 35)
                System.out.print(i + " ");
        }
    }
}
