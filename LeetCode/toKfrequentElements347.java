import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class toKfrequentElements347 {
    public static class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }
        public int compareTo(Pair o){
            return this.freq - o.freq;
        }
    }
    public static int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        for(int key : map.keySet()){
            pq.add(new Pair(key,map.get(key)));
            if(pq.size()>k) pq.remove();
        }
        int[] ans = new int[k];
        while(!pq.isEmpty()){
            ans[k---1] = pq.poll().ele;
        }
        return ans;
    }

    static void main(String[] args) {
        int[] nums = {1,2,1,2,1,2,3,1,3,2};
        print(nums);
        int k = 2;
        int[] ans = topKFrequent(nums,k);
        System.out.print("top "+k+" frequent elements are : ");
        print(ans);
    }
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
