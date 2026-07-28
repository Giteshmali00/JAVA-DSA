import java.util.Collections;
import java.util.PriorityQueue;

public class kClosetPointsToOrigin973 {
    public static class Pair implements Comparable<Pair>{
        int d;
        int[] cord;
        Pair(int d, int[] cord){
            this.d = d;
            this.cord = cord;
        }
        public int compareTo(Pair p){
            return this.d - p.d;
        }
    }
    public static int[][] kClosest(int[][] points, int k) {
        if(points.length==k) return points;
        int[][] ans = new int[k][2];
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < points.length; i++){
            int x = points[i][0], y = points[i][1];
            int dist = x*x + y*y;
            pq.add(new Pair(dist,points[i]));
            if(pq.size()>k) pq.poll();
        }
        while(!pq.isEmpty()){
            ans[k---1] = pq.poll().cord;
        }
        return ans;
    }

    static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        print(points);
        System.out.print("K closests Cordicates are : ");
        print(kClosest(points,2));
    }
    public static void print(int[][] arr){
        for(int[] e : arr){
            System.out.print("{"+e[0]+","+e[1]+"}");
        }
        System.out.println();
    }
}
