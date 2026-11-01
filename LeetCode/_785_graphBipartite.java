import java.util.Queue;
import java.util.LinkedList;

public class _785_graphBipartite {
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
                if(!bfs(graph,vis,i)){
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
