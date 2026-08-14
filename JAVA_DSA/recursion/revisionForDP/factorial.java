package revisionForDP;//package revisionForDP;

import java.util.Scanner;

public class factorial {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Factorial of "+n+" : "+fact(n));
    }
    public static int fact(int n){
        if(n<=1) return 1;
        return n * fact(n-1);
    }
}
