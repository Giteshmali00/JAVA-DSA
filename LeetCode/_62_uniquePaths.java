import java.util.Scanner;

public class _62_uniquePaths {
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
        System.out.println("Total number of Unique Paths : "+uniquePaths(m,n));
    }
}
