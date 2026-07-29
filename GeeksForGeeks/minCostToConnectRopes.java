import java.util.PriorityQueue;

public class minCostToConnectRopes {
    public static int minCost(int[] arr) {
        // MinHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele : arr){
            pq.add(ele);
        }
        int ans = 0;
        while(pq.size()>1){
            int sum = pq.poll()+pq.poll();
            pq.add(sum);
            ans += sum;
        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {4,5,2,1,8,9};
        print(arr);
        System.out.println("Minimum cost to connect the Ropes : "+minCost(arr));
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
