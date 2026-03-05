//package interviewQuestionsOnStack;

import java.util.Stack;

public class previousGreaterElement {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int[] pge(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            while(!st.isEmpty() && st.peek() <= arr[i])
                st.pop();
            nge[i] = st.isEmpty() ? -1 : st.peek();

            st.push(arr[i]);
        }

        return nge;
    }
    static void main(String[] args) {
        int[] arr = {1, 3, 2, 4};
        print(arr);
        arr = pge(arr);
        print(arr);
    }
}
