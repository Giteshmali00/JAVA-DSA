public class _509_fibonacciNumber {
    public static int fib4(int n) {
        //Tabulation DP (Bottom-up DP) = Iterative DP
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public static int helper(int n, int[] dp){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        return dp[n] = helper(n-1,dp) + helper(n-2,dp);
    }
    public static int fib3(int n) {
        //Memoization DP (Top Down DP) = Recursive DP
        int[] dp = new int[n+1];
        return helper(n,dp);
    }

    public static int fib2(int n) {
        int sum = 0;
        for(int i = 0, a = 0, b = 1; i < n; i++){
            a = b;
            b = sum;
            sum = a + b;
        }
        return sum;
    }

    public static int fib1(int n) {
        if(n<=1) return n;
        return fib1(n-1) + fib1(n-2);
    }

    static void main(String[] args) {
        System.out.println("fib1() : "+fib1(6));
        System.out.println("fib2() : "+fib1(6));
        System.out.println("fib3() : "+fib1(6));
        System.out.println("fib4() : "+fib1(6));
    }
}
