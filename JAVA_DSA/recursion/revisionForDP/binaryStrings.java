package revisionForDP;

import java.util.Scanner;

public class binaryStrings {
    static void printRec(int n, String ans){
        if(n<=0) {
            System.out.print(ans+" ");
            return;
        }
        printRec(n-1,ans+0);
        int x = ans.length();
        if(x>0 && ans.charAt(x-1)=='1') return;
        printRec(n-1,ans+1);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        printRec(n,"");
    }
}
