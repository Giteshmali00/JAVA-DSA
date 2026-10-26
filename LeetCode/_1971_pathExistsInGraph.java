import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class _1971_pathExistsInGraph {
    static void main(String[] args) {
        int n = 6;
        int[][] edges = {{0,1},{0,2},{3,5},{5,4},{4,3}};
        int source = 0, destination = 5;
        System.out.printf("n: %d \nsource: %d \ndestination: %d", n, source, destination);
        System.out.println();
        System.out.print("Edges: ");
        print(edges);
        System.out.print("Path is valid? : "+validPath(n,edges,source,destination));
    }

    private static void print(int[][] edges) {
        for(int[] edge : edges){
            System.out.print("{"+edge[0]+" "+edge[1]+"} ");
        }
        System.out.println();
    }

    public static boolean bfs(int start, int end, List<List<Integer>> adj, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;
        while(!q.isEmpty()){
            int front = q.remove();
            for(int ele : adj.get(front)){
                if(end==ele) return true;
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }
        return false;
    }
    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination) return true;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        boolean[] vis = new boolean[n];
        return bfs(source, destination, adj, vis);
    }
}
