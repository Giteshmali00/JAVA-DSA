import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;

public class unboundedKnapsack {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity : ");
        int c = sc.nextInt();
        System.out.print("Enter size of the arrays : ");
        int n = sc.nextInt();
        int[] val = new int[n];
        int[] wt = new int[n];
        System.out.println("Enter price and weight respectively : ");
        for(int i = 0; i < n; i++){
            val[i] = sc.nextInt();
            wt[i] = sc.nextInt();
        }
        print(val);
        print(wt);
        System.out.println("Answer : "+knapsack(val,wt,c));
    }

    private static int knapsack(int[] val, int[] wt, int c) {
        int n = val.length;
        int[][] dp = new int[c+1][n+1];
        for(int i = 0; i < c+1; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(val,wt,c,0,dp);
    }

    private static int helper(int[] val, int[] wt, int c, int i, int[][] dp) {
        if(i==val.length) return 0;
        if(dp[c][i]!=-1) return dp[c][i];
        int skip = helper(val,wt,c,i+1,dp);
        if(wt[i]>c) return dp[c][i] = skip;
        int pick = val[i] + helper(val,wt,c-wt[i],i,dp);
        return dp[c][i] = Math.max(skip,pick);
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
