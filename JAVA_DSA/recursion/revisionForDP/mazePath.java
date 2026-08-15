package revisionForDP;

import java.util.Scanner;

public class mazePath {
    static int path(int m, int n){
        if(m==1 || n==1) return 1;
        return path(m-1,n) + path(m,n-1);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M : ");
        int m = sc.nextInt();
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.println("Total paths : "+path(m,n));
    }
}
