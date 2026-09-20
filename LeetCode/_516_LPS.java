import java.util.Arrays;
import java.util.Scanner;

public class _516_LPS {
    public static int helper(String s, int i, int j, int[][] dp){
        if(i<0 || j >= s.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s.charAt(j))
            return dp[i][j] = 1 + helper(s,i-1,j+1,dp);
        else
            return dp[i][j] = Math.max(helper(s,i-1,j,dp),helper(s,i,j+1,dp));

    }
    public static int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(s,n-1,0,dp);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s = sc.nextLine();
        System.out.println("String = "+s);
        System.out.print("Longest Palindromic Subsequence is : "+longestPalindromeSubseq(s));
    }
}
