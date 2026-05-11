import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class slidingWindowMax239 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    //Approach 1 : Using Stack
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && nums[i] > nums[st.peek()]) st.pop();
            if(st.isEmpty()) nge[i] = n;
            else nge[i] = st.peek();

            st.push(i);
        }
        int j = 0;
        for(int i = 0; i < n-k+1; i++){
            if(j>=i+k) j=i;
            int mx = nums[j];
            while(j < i+k){
                mx = nums[j];
                j = nge[j];
            }
            ans[i] = mx;
        }

        return ans;
    }
    //Approach 2 : Using Deque
    public static int[] maxSlidingWindow2(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        Deque<Integer> dq = new LinkedList<>();

        for(int i = 0; i < n; i++){
            while(!dq.isEmpty() && i - dq.peekFirst() >= k)
                dq.pollFirst();
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();
            dq.addLast(i);
            if(i >= k - 1) ans[i - k + 1] = nums[dq.peekFirst()];
        }

        return ans;
    }
    static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        print(arr);
        int k = 3;
        System.out.println("K = "+k);
        int[] ans = maxSlidingWindow2(arr,k);

        print(ans);
    }
}
