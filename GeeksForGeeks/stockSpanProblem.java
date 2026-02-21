import java.util.ArrayList;
import java.util.Stack;

public class stockSpanProblem {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
            while(st.size() != 0 && arr[st.peek()] <= arr[i])
                st.pop();
            if(st.size() != 0)
                ans.add(i-st.peek());
            else
                ans.add(i+1);

            //Always push the current ele/eleIdx
            st.push(i);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {100,80,90,120};
        print(arr);
        ArrayList<Integer> ans = calculateSpan(arr);
        System.out.println(ans);
    }
}
