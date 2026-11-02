import java.util.Queue;
import java.util.LinkedList;

public class _785_graphBipartite {
    //Method 2 :
    public static boolean dfs(int[][] graph, int[] vis, int parent, int vertex){
        vis[vertex] = -parent;
        for(int ele : graph[vertex]){
            if(vis[ele]==0){
                if(!dfs(graph, vis, vis[vertex], ele))
                    return false;
            }else if(vis[ele]==vis[vertex])
                return false;
        }
        return true;
    }
    //Method 1 :
    public static boolean bfs(int[][] graph, int[] vis, int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = -1;
        while(!q.isEmpty()){
            int front = q.remove();
            for(int ele : graph[front]){
                if(vis[ele]==0){
                    q.add(ele);
                    vis[ele] = vis[front] * -1;
                }else if(vis[ele]==vis[front]){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] vis = new int[n];
        for(int i=0; i<n; i++){
            if(vis[i]==0){
                if(!dfs(graph,vis,1,i)){
                    return false;
                }
            }
        }
        return true;
    }
    static void main(String[] args) {
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        print(graph);
        System.out.println("is Graph Bipartite? : "+isBipartite(graph));
    }

    private static void print(int[][] graph) {
        for(int[] a : graph){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
