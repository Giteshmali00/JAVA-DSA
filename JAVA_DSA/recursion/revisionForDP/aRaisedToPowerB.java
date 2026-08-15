package revisionForDP;

import java.util.Scanner;

public class aRaisedToPowerB {
    static int print(int a, int b){
        if(b==0) return 1;
        int ans = print(a,b/2);
        if(b%2!=0) return ans * ans * a;
        return ans * ans;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("a raised to power b : "+print(a,b));
    }
}
