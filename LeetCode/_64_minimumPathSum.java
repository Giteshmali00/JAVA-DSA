public class _64_minimumPathSum {

    //Method 2:
    public static int helper(int[][] arr, int m, int n, int[][] dp){
        if(m==0 && n==0) return arr[m][n];
        if(m==0) return dp[m][n] = arr[m][n] + helper(arr,m,n-1,dp);
        if(n==0) return dp[m][n] = arr[m][n] + helper(arr,m-1,n,dp);
        if(dp[m][n]!=0) return dp[m][n];
        return dp[m][n] = arr[m][n] + Math.min(helper(arr,m-1,n,dp),helper(arr,m,n-1,dp));
    }
    public static int minPathSum2(int[][] grid) {
        //Memoization : Top-down DP
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m+1][n+1];
        return helper(grid,m-1,n-1,dp);
    }
    //Method 1:
    public static int minPathSum(int[][] grid) {
        //Tabulation: Bottom-up DP
        int m = grid.length;
        int n = grid[0].length;
        for(int i = 1; i < n; i++){
            grid[0][i] += grid[0][i-1];
        }
        for(int i = 1; i < m; i++){
            grid[i][0] += grid[i-1][0];
        }
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                grid[i][j] += Math.min(grid[i][j-1],grid[i-1][j]);
            }
        }
        return grid[m-1][n-1];
    }

    static void main(String[] args) {
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        print(grid);
//        System.out.println("Minimum Path Sum: "+minPathSum(grid));
        System.out.println("Minimum Path Sum: "+minPathSum2(grid));
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
