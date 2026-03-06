import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class visiblePeopleInQueue1944 {
    public static void print(int[] arr){
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int[] canSeePersonsCount(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] < arr[i]){
                ans[st.peek()]++;
                st.pop();
            }
            if(!st.isEmpty()) ans[st.peek()]++;
            st.push(i);
        }
        return ans;
    }

    static void main(String[] args) {
        int[] arr = {10,6,8,5,11,9};
        print(arr);
        arr = canSeePersonsCount(arr);
        print(arr);
    }
}
