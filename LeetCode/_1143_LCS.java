import java.util.Arrays;
import java.util.Scanner;

public class _1143_LCS {
    //Method 2 : Bottom-up DP (Tabulation) - Memory Utilized method
    public static int longestCommonSubsequence2(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[2][m+1];

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[1][j] = 1 + dp[0][j-1];
                }else {
                    dp[1][j] = Math.max(dp[1][j-1],dp[0][j]);
                }
                if(j>1) dp[0][j-1] = dp[1][j-1];
            }
            dp[0][m] = dp[1][m];
        }

        return dp[1][m];
    }
    //Method 1 : Using Top-down DP (Memoization)
    public static int helper(String text1, String text2, int i, int j, int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j))
            return dp[i][j] = 1 + helper(text1,text2,i-1,j-1,dp);
        else
            return dp[i][j] = Math.max(helper(text1,text2,i-1,j,dp),helper(text1,text2,i,j-1,dp));

    }
    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n][m];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(text1,text2,n-1,m-1,dp);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text1 : ");
        String text1 = sc.nextLine();
        System.out.print("Enter text2 : ");
        String text2 = sc.nextLine();
        System.out.println("text1 = "+text1);
        System.out.println("text2 = "+text2);
        System.out.println("Longest Common Subsequence is : "+longestCommonSubsequence(text1,text2));
        System.out.println("Longest Common Subsequence is : "+longestCommonSubsequence2(text1,text2));
    }
}
