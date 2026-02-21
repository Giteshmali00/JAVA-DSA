import java.util.Stack;

public class largestRectangleInHistogram84 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        for(int i = n-1; i >= 0; i--){
            //Next Smallest Elements (nse)
            while(st.size() != 0 && arr[st.peek()] >= arr[i])
                st.pop();
            if(st.size() == 0)
                nse[i] = n;
            else
                nse[i] = st.peek();
            st.push(i);

            //Previouse Smallest Elements (pse)
            int j = n-i-1;
            while(st2.size() != 0 && arr[st2.peek()] > arr[j])
                st2.pop();
            if(st2.size() == 0)
                pse[j] = -1;
            else
                pse[j] = st2.peek();
            st2.push(j);
        }

        int ans = 0;
        for(int i = 0; i < n; i++){
            int ms = arr[i] * (nse[i] - pse[i] - 1);
            if(ms > ans) ans = ms;
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        print(arr);
        System.out.println("Largest Rectangle In Histogram is : "+largestRectangleArea(arr));
    }
}