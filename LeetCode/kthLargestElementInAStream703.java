import java.util.PriorityQueue;

public class kthLargestElementInAStream703 {
    public static class KthLargest {
        PriorityQueue<Integer> pq;
        int k;
        public KthLargest(int k, int[] nums) {
            pq = new PriorityQueue<>();
            for(int i = 0; i < nums.length; i++){
                pq.add(nums[i]);
                if(pq.size()>k) pq.remove();
            }
            this.k = k;
        }

        public int add(int val) {
            pq.add(val);
            if(pq.size()>k) pq.remove();
            return pq.peek();
        }
    }

    static void main(String[] args) {
        int[] nums = {4,5,8,2};
        KthLargest stream = new KthLargest(3,nums);
        System.out.println(stream.add(3));
        System.out.println(stream.add(5));
        System.out.println(stream.add(10));
        System.out.println(stream.add(9));
        System.out.println(stream.add(4));
    }
}
