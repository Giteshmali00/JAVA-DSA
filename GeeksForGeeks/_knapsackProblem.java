import java.util.Arrays;
import java.util.Scanner;

public class _knapsackProblem {
    public static int helper(int[] val, int[] wt, int c, int i, int[][] dp){
        if(i==val.length) return 0;
        if(dp[c][i] != -1) return dp[c][i];
        int skip = helper(val,wt,c,i+1,dp);
        if(wt[i]>c) return dp[c][i] = skip;
        int pick = val[i] + helper(val,wt,c-wt[i],i+1,dp);
        return dp[c][i] = Math.max(pick,skip);
    }
    public static int knapsack(int c, int[] val, int[] wt) {
        // code here
        int n = val.length;
        int[][] dp = new int[c+1][n];
        for(int i = 0; i <= c; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(val,wt,c,0,dp);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Capacity : ");
        int c = sc.nextInt();
        System.out.print("Enter size of arrays : ");
        int n = sc.nextInt();
        int[] val = new int[n];
        int[] wt = new int[n];
        System.out.println("Enter price and weight : ");
        for(int i = 0; i < n; i++){
            val[i] = sc.nextInt();
            wt[i] = sc.nextInt();
        }
        print(val);
        print(wt);
        System.out.println("Total value obtained is maximum without exceeding the capacity c. : "+knapsack(c,val,wt));
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
