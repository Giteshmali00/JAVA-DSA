import java.util.Arrays;
import java.util.Scanner;

public class _62_uniquePaths {
    //Method 2 : Space optimized method (Prefix sum + Bottom-up DP (Tabulation));
    public static int uniquePaths2(int m, int n) {
        if(m==1 || n==1) return 1;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[j] += dp[j-1];
            }
        }
        return dp[n-1];
    }
//    Method 2:
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i==0 || j==0) dp[i][j] = 1;
                else dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M: ");
        int m = sc.nextInt();
        System.out.print("Enter N: ");
        int n = sc.nextInt();
//        System.out.println("Total number of Unique Paths : "+uniquePaths(m,n));
        System.out.println("Total number of Unique Paths : "+uniquePaths2(m,n));
    }
}
