import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class _802_eventualSafeStates {
    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        //reverse the graph
        List<List<Integer>> adj = new ArrayList<>();
        int[] indegree = new int[n];
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<n; i++){
            indegree[i] = graph[i].length;
            for(int ele : graph[i]){
                adj.get(ele).add(i);
            }
        }
        //apply kahn's algorithm
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(indegree[i]==0) q.add(i);
        }
        LinkedList ans = new LinkedList<>();
        while(!q.isEmpty()){
            int front = q.remove();
            ans.add(front);
            for(int ele : adj.get(front)){
                indegree[ele]--;
                if(indegree[ele]==0) q.add(ele);
            }
        }
        Collections.sort(ans);
        return ans;
    }

    static void main(String[] args) {
        int[][] graph = new int[][]{{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        print(graph);
        System.out.print("Eventually safe nodes : "+eventualSafeNodes(graph));
    }

    private static void print(int[][] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(i+"->");
            for(int ele : arr[i]){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

}
