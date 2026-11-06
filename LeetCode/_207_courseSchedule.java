import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class _207_courseSchedule {
    //Kahn's algorithm
    public static boolean bfs(List<List<Integer>> adj, int[] inDegree){
        int n = adj.size();
        List<Integer> l = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int front = q.remove();
            l.add(front);
            for(int ele : adj.get(front)){
                inDegree[ele]--;
                if(inDegree[ele]==0){
                    q.add(ele);
                }
            }
        }
        return l.size() == n;
    }
    public static boolean canFinish(int n, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        int[] inDegree = new int[n];
        for(int[] a : prerequisites){
            adj.get(a[1]).add(a[0]);
            inDegree[a[0]]++;
        }
        return bfs(adj, inDegree);
    }

    static void main(String[] args) {
        int n = 6;
        int[][] prereq = {{3,2},{1,0},{2,1},{4,3},{0,3}};
        System.out.println("N : "+n);
        System.out.print("Prerequisites : ");
        print(prereq);
        System.out.println("You Finished all courses? : "+canFinish(n, prereq));
    }

    private static void print(int[][] prereq) {
        for(int[] a : prereq){
            System.out.print("{"+a[0]+", "+a[1]+"}");
        }
        System.out.println();
    }
}
