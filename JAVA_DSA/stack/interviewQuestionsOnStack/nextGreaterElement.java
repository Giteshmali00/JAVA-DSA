//package interviewQuestionsOnStack;

import java.util.Stack;

public class nextGreaterElement {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,2,8};
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        res[n-1] = -1;
        for(int i = n-2; i>=0; i--){
            while(st.size() > 0 && st.peek() <= arr[i]) st.pop();
            if(st.size() == 0) res[i] = -1;
            else res[i] = st.peek();
            st.push(arr[i]);
        }
        print(arr);
        print(res);
    }
}
