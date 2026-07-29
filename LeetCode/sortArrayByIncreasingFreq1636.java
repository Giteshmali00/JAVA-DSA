import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class sortArrayByIncreasingFreq1636 {
    public static class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele, int freq){
            this.ele = ele;
            this.freq = freq;
        }
        public int compareTo(Pair o){
            if(this.freq == o.freq)
                return o.ele - this.ele;
            return this.freq - o.freq;
        }
    }
    public static int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int ele : nums){
            map.put(ele, map.getOrDefault(ele,0)+1);
        }
        for(int key : map.keySet()){
            pq.add(new Pair(key,map.get(key)));
        }
        int i = 0;
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            int f = p.freq;
            while(f--!=0)
                nums[i++] = p.ele;
        }

        return nums;
    }

    static void main(String[] args) {
        int[] nums = {-1,1,-6,4,5,-6,1,4,1};
        print(nums);
        frequencySort(nums);
        print(nums);
    }
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
