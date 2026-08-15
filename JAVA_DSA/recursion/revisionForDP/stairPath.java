package revisionForDP;

import java.util.Scanner;

public class stairPath {
    static int paths(int n){
        if(n<=0) return 0;
        if(n==1) return 1;
        if(n==3) return 2;
        return paths(n-1) + paths(n-3);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Stairs : ");
        int n = sc.nextInt();
        System.out.println("Total paths : "+paths(n));
    }
}
