package revisionForDP;

import java.util.Scanner;

public class subSets2 {
    static void printSubsets(int n, int k, String ans, int i){
        if(ans.length()==k){
            System.out.print(ans+" ");
            return;
        }
        if(i==n+1) return;
        printSubsets(n,k,ans,i+1);
        printSubsets(n,k,ans+i,i+1);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.print("Enter K : ");
        int k = sc.nextInt();
        printSubsets(n,k,"",1);
    }
}
