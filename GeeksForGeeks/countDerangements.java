import java.util.Scanner;

public class countDerangements {
    //Method 1:
    public static int derangeCount2(int n) {
        //Tabulation Bottom-up DP
        int[] dp = new int[n+1];
        if(n>=2) dp[2] = 1;
        for(int i = 3; i <= n; i++){
            dp[i] = (i-1) * (dp[i-1] + dp[i-2]);
        }
        return  dp[n];
    }
    //Method 2:
    public static int helper(int n, int[] dp){
        if(n<=1) return 0;
        if(n==2) return 1;
        if(dp[n]!=0) return dp[n];
        return dp[n] = (n-1) * (helper(n-1,dp) + helper(n-2,dp));
    }
    public static int derangeCount(int n) {
        //Memoization Top-down DP
        //Recurrence relation : f(n) = (n-1) * (helper(n-1) + helper(n-2));
        int[] dp = new int[n+1];
        return helper(n,dp);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
//        System.out.print("Total Number of Derangements : "+derangeCount(n));
        System.out.print("Total Number of Derangements : "+derangeCount2(n));
    }
}
