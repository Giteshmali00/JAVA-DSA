import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class _841_keysAndRooms {
    public static void dfs(List<List<Integer>> rooms, boolean[] vis, int i){
        if(vis[i]) return;
        vis[i] = true;
        for(int key : rooms.get(i)){
            dfs(rooms,vis,key);
        }
    }
    public static void bfs(List<List<Integer>> rooms, boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while(!q.isEmpty()){
            int front = q.remove();
            for(int ele : rooms.get(front)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }
    }
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        bfs(rooms,vis);
        for(boolean ele : vis){
            if(!ele) return false;
        }
        return true;
    }
    static void main(String[] args) {
        int[][] arr = {{1,3},{3,0,1},{2},{0}};
        List<List<Integer>> rooms = new ArrayList<>();
        fillList(arr,rooms);
        System.out.println(rooms);
        System.out.println("Can visit all rooms? : "+canVisitAllRooms(rooms));
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
