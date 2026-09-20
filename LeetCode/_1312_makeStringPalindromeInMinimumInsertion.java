import java.util.Arrays;
import java.util.Scanner;

public class _1312_makeStringPalindromeInMinimumInsertion {
    public static int helper(String s, int i, int j, int[][] dp){
        if(i>=j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==s.charAt(j))
            return dp[i][j] = helper(s,i+1,j-1,dp);
        else {
            int left = 1 + helper(s,i,j-1,dp);
            int right = 1 + helper(s,i+1,j,dp);
            return dp[i][j] = Math.min(left,right);
        }
    }
    public static int minInsertions(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(s,0,n-1,dp);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = sc.next();
        System.out.println("String : "+str);
        System.out.println("Minimum insertion Steps to make a string palindrome : "+minInsertions(str));
    }
}
