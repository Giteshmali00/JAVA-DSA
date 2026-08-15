//package revisionForDP;

import java.util.Scanner;

public class printNto1 {
    static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.println(n);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        print(n);
    }
}
