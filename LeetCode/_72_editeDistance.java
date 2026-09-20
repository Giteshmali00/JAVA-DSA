import java.util.Arrays;
import java.util.Scanner;

public class _72_editeDistance {
    public static int helper(String word1, String word2, int i, int j, int[][] dp){
        if(i==-1) return j+1;
        if(j==-1) return i+1;
        if(dp[i][j]!=-1) return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j)){
            return dp[i][j] = helper(word1,word2,i-1,j-1,dp);
        }else{
            int ins = helper(word1,word2,i-1,j,dp);
            int rev = helper(word1,word2,i,j-1,dp);
            int rep = helper(word1,word2,i-1,j-1,dp);
            return dp[i][j] = 1 + Math.min(ins,Math.min(rev,rep));
        }
    }
    public static int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dp = new int[m][n];
        for(int i = 0; i < m; i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(word1, word2, m-1, n-1,dp);
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word1 : ");
        String word1 = sc.next();
        System.out.print("Enter word2 : ");
        String word2 = sc.next();

        System.out.println("Word1 = "+word1);
        System.out.println("Word2 = "+word2);

        System.out.println("Edite distance : "+minDistance(word1,word2));
    }
}
