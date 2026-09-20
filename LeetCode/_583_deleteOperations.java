import java.util.Arrays;
import java.util.Scanner;

public class _583_deleteOperations {
    public static int helper(String word1, String word2, int w1, int w2, int[][] dp){
        int m = word1.length(), n = word2.length();
        if(w1>=m) return n - w2;
        if(w2>=n) return m - w1;
        if(dp[w1][w2]!=-1) return dp[w1][w2];
        if(word1.charAt(w1)==word2.charAt(w2))
            return dp[w1][w2] = helper(word1,word2,w1+1,w2+1,dp);
        int del1 = 1 + helper(word1,word2,w1+1,w2,dp);
        int del2 = 1 + helper(word1,word2,w1,w2+1,dp);
        return dp[w1][w2] = Math.min(del1,del2);
    }
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(word1, word2, 0, 0,dp);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word1 : ");
        String word1 = sc.next();
        System.out.print("Enter word2 : ");
        String word2 = sc.next();

        System.out.println("Word1 = "+word1);
        System.out.println("Word2 = "+word2);

        System.out.println("Delete operations for two strings : "+minDistance(word1,word2));
    }

}
