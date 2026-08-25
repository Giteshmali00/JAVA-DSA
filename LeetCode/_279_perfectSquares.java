import java.util.Scanner;

public class _279_perfectSquares {
    public static boolean isPerfect(int n){
        int sqrt = (int)Math.sqrt(n);
        return sqrt*sqrt==n;
    }
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
        System.out.println("Least number of perfect square numbers that sum to "+n+" : "+numSquares(n));
    }
}
