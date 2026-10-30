import java.util.Queue;
import java.util.LinkedList;

public class _200_numberOfIslands {
    //Method 2 : DFS
    public static void dfs(char[][] grid, int i, int j){
        if(i==-1 || j==-1 || i==grid.length || j==grid[0].length || grid[i][j]=='0')
            return;

        grid[i][j] = '0';

        dfs(grid,i,j-1);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i+1,j);
    }
    //Method 1 : BFS
    public static void bfs(char[][] grid, int x, int y){
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});
        grid[x][y] = '0';
        while(!q.isEmpty()){
            int[] part = q.remove();
            int i = part[0], j = part[1];
            if(j<n-1 && grid[i][j+1]=='1'){
                q.add(new int[]{i,j+1});
                grid[i][j+1] = '0';
            }
            if(i<m-1 && grid[i+1][j]=='1'){
                q.add(new int[]{i+1,j});
                grid[i+1][j] = '0';
            }
            if(j>0 && grid[i][j-1]=='1'){
                q.add(new int[]{i,j-1});
                grid[i][j-1] = '0';
            }
            if(i>0 && grid[i-1][j]=='1'){
                q.add(new int[]{i-1,j});
                grid[i-1][j] = '0';
            }
        }
    }
    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    static void main(String[] args) {
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','1','0'},
                {'0','0','0','1','1'}
        };
        print(grid);
        System.out.println("Number of Islands: "+numIslands(grid));
    }
    private static void print(char[][] arr) {
        for(char[] a : arr){
            for(char ch : a){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}