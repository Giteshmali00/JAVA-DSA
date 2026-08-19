package revisionForDP;

import java.util.Scanner;

public class hcf {
    static int gcd(int a, int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println("HCF : "+gcd(a,b));
    }
}
