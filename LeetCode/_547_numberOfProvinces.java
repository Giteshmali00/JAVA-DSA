import java.util.LinkedList;
import java.util.Queue;

public class _547_numberOfProvinces {
    static void main(String[] args) {
        int[][] adj = {{1,1,0},{1,1,0},{0,0,1}};
        print(adj);
        System.out.println("Total number of provinces: "+findCircleNum(adj));
    }
    //Method 2 : DFS
    public static void dfs(int[][] adj, boolean[] vis, int nod){
        vis[nod] = true;
        for(int i=0; i<adj.length; i++){
            if(adj[nod][i]==1 && !vis[i]){
                dfs(adj, vis, i);
            }
        }
    }
    //Method 1 : BFS
    public static void bfs(int[][] adj, boolean[] vis, int nod){
        Queue<Integer> q = new LinkedList<>();
        q.add(nod);
        vis[nod] = true;
        while(!q.isEmpty()){
            int x = q.remove();
            for(int i=0; i<adj.length; i++){
                if(adj[x][i]==1 && !vis[i]){
                    q.add(i);
                    vis[i] = true;
                }
            }
        }
    }
    public static int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;
        boolean[] vis = new boolean[n];
        for(int i=0; i<n; i++){
            if(!vis[i]){
                bfs(adj, vis, i);
                count++;
            }
        }
        return count;
    }
    private static void print(int[][] arr) {
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
