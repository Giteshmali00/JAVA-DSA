import java.util.Arrays;

public class _63_uniquePath2 {
    //Method 2 : Using Tabulation -- Bottom-up DP
    public static int uniquePathsWithObstacles2(int[][] og) {
        int m = og.length;
        int n = og[0].length;
        if(og[m-1][n-1]==1 || og[0][0]==1)
            return 0;
        boolean flag = false;
        for(int i = 0; i < n; i++){
            if(og[0][i]==1) flag = true;
            if(flag) og[0][i] = 0;
            else og[0][i] = 1;
        }
        flag = false;
        for(int i = 1; i < m; i++){
            if(og[i][0]==1) flag = true;
            if(flag) og[i][0] = 0;
            else og[i][0] = 1;
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(og[i][j]==1) og[i][j] = 0;
                else og[i][j] = og[i][j-1] + og[i-1][j];
            }
        }
        return og[m-1][n-1];
    }

    //Method 1: Top-down DP -- Memoization
    public static int uniquePaths(int[][] og, int m, int n, int[][] dp){
        if(og[m][n]==1) return 0;
        if(m==0 && n==0) return 1;
        if(dp[m][n]!=-1) return dp[m][n];
        if(m==0) return dp[m][n] = uniquePaths(og,m,n-1,dp);
        if(n==0) return dp[m][n] = uniquePaths(og,m-1,n,dp);
        return dp[m][n] = uniquePaths(og,m-1,n,dp) + uniquePaths(og,m,n-1,dp);
    }
    public static int uniquePathsWithObstacles(int[][] og) {
        int m = og.length;
        int n = og[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0; i<m; i++){
            Arrays.fill(dp[i], -1);
        }
        return uniquePaths(og,m-1,n-1,dp);
    }

    static void main(String[] args) {
        int[][] obstacleGrid = {{0, 0, 0},{0, 1, 0},{0, 0, 0}};
        print(obstacleGrid);
//        System.out.println("Unique path with Obstacles : "+uniquePathsWithObstacles(obstacleGrid));
        System.out.println("Unique path with Obstacles : "+uniquePathsWithObstacles2(obstacleGrid));
    }
    public static void print(int[][] arr){
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
