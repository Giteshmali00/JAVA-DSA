import java.util.ArrayList;
import java.util.List;

public class ratInAMaze {
    public static void paths(int[][] maze, List<String> ans, int row, int col, String path){
        int n = maze.length;
        if(maze[row][col]==0) return;
        if(row==n-1 && col==n-1){
            ans.add(path);
            return;
        }
        maze[row][col] = 0;
        if(row < n-1 && maze[row+1][col]==1)
            paths(maze,ans,row+1,col,path+'D');

        if(col > 0 && maze[row][col-1]==1)
            paths(maze,ans,row,col-1,path+'L');

        if(col < n-1 && maze[row][col+1]==1)
            paths(maze,ans,row,col+1,path+'R');

        if(row > 0 && maze[row-1][col]==1)
            paths(maze,ans,row-1,col,path+'U');
        maze[row][col]=1;
    }
    public static ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> ans = new ArrayList<>();
        paths(maze,ans,0,0,"");
        return ans;
    }

    static void main(String[] args) {
        int[][] maze = {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
        print(maze);
        System.out.println("Valid Paths : "+ratInMaze(maze));
    }

    private static void print(int[][] maze) {
        for(int[] a : maze){
            for (int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
