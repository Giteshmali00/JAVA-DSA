import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class nextGreaterElement {
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i])
                st.pop();
            nge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : nge) ans.add(ele);
        return ans;
    }
    static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        System.out.println(nextLargerElement(arr));
    }
}
