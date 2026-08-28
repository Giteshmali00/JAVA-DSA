import java.util.Arrays;
import java.util.Scanner;

public class _279_perfectSquares {
    public static boolean isPerfect(int n){
        int sqrt = (int)Math.sqrt(n);
        return sqrt*sqrt==n;
    }

    //Method 2 : Using Tabulation : Top-down DP
    public static int numSquares2(int n, int[] dp) {
        if(isPerfect(n)) return 1;
        if(dp[n]!=-1) return dp[n];
        int min = Integer.MAX_VALUE;
        for(int i = 1; i*i < n; i++){
            int count = numSquares2(i*i,dp) + numSquares2(n-i*i,dp);
            min = Math.min(min,count);
        }
        return dp[n] = min;
    }
    public static int numSquares2(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return numSquares2(n,dp);
    }
    //Method 2 : Using Tabulation : Bottom-up DP
    public static int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i = 1; i <= n; i++){
            int min = Integer.MAX_VALUE;
            if(isPerfect(i)) dp[i] = 1;
            else{
                for(int j = 1; j*j<i; j++){
                    int count = dp[j*j] + dp[i-j*j];
                    min = Math.min(count,min);
                }
                dp[i] = min;
            }
        }
        return dp[n];
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N :");
        int n = sc.nextInt();
//        System.out.println("Least number of perfect square numbers that sum to "+n+" : "+numSquares(n));
        System.out.println("Least number of perfect square numbers that sum to "+n+" : "+numSquares2(n));
    }
}
