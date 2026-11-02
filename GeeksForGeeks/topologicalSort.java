import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class topologicalSort {
    //Method 2:
    public static void bfs(ArrayList<ArrayList<Integer>> adj, int[] inDegree, ArrayList<Integer> ans){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<inDegree.length; i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int front = q.remove();
            ans.add(front);
            for(int ele : adj.get(front)){
                inDegree[ele]--;
                if(inDegree[ele]==0){
                    q.add(ele);
                }
            }
        }

    }
    public static ArrayList<Integer> topoSort2(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        ArrayList<Integer> ans = new ArrayList<>();
        int[] inDegree = new int[n];
        //Fill the inDegree array
        for(ArrayList<Integer> a : adj){
            for(int ele : a){
                inDegree[ele]++;
            }
        }
        bfs(adj, inDegree, ans);
        return ans;
    }
    //Method 1:
    public static void dfs(ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> ans, int vertex){
        vis[vertex] = true;
        for(int ele : adj.get(vertex)){
            if(!vis[ele]){
                dfs(adj, vis, ans, ele);
                ans.add(ele);
            }
        }
    }
    public static ArrayList<Integer> topoSort(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[n];
        for(int i=0; i<n; i++){
            if(!vis[i]){
                dfs(adj, vis, ans, i);
                ans.add(i);
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    static void main(String[] args) {
        int[][] arr = {{}, {3}, {3}, {}, {1, 0}, {0, 2}};
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        print(arr);
        fillList(arr,adj);
        System.out.println("topological order (dfs): "+topoSort(adj));
        System.out.println("topological order (bfs): "+topoSort2(adj));
    }
    private static void fillList(int[][] arr, ArrayList<ArrayList<Integer>> rooms) {
        for(int[] a : arr){
            ArrayList<Integer> list = new ArrayList<>();
            for(int ele : a){
                list.add(ele);
            }
            rooms.add(list);
        }
    }

    private static void print(int[][] arr) {
        for(int[] a : arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
