import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class undirectedGraphCycle {
    public static class Pair{
        int parent;
        int vertex;
        Pair(int parent, int vertex){
            this.parent = parent;
            this.vertex = vertex;
        }
    }
    public static boolean bfs(List<List<Integer>> adj, boolean[] visited, int start){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(-1,start));
        visited[start] = true;
        while(!q.isEmpty()){
            Pair p = q.remove();
            for(int ele: adj.get(p.vertex)){
                if(!visited[ele]){
                    q.add(new Pair(p.vertex, ele));
                    visited[ele] = true;
                }else if(ele != p.parent){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycle(List<List<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];
        for(int i=0; i<adj.size(); i++){
            if(!visited[i]){
                if(bfs(adj, visited, i)){
                    return true;
                }
            }
        }
        return false;
    }

    static void main(String[] args) {
        int[][] arr = {{1, 2}, {0, 2}, {0, 1, 3}, {2}};
        List<List<Integer>> adj = new ArrayList<>();
        fillList(arr,adj);
        System.out.println(adj);
        System.out.println("is Cycle detected? : "+isCycle(adj));
    }

    private static void fillList(int[][] arr, List<List<Integer>> rooms) {
        for(int[] a : arr){
            List<Integer> list = new ArrayList<>();
            for(int ele : a){
                list.add(ele);
            }
            rooms.add(list);
        }
    }
}
