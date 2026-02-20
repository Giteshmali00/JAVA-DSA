
import java.util.Stack;

public class removeConsecutiveSubsequences {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    //method 1 : Using flag
    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(st.size() == 0) st.push(arr[i]);
            else if(st.peek() == arr[i]) flag = true;
            else if(flag){
                st.pop();
                st.push(arr[i]);
                flag = false;
            }else st.push(arr[i]);
        }
        int[] ans = new int[st.size()];
        for(int i = 0; i < ans.length; i++){
            ans[ans.length - i-1] = st.pop();
        }
        System.out.println();
        return ans;
    }//method 2 : Raghav Sir
    public static int[] remove2(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            if(st.size() == 0 || st.peek() != arr[i]) st.push(arr[i]);
            else {
                if(i == n-1 || arr[i] != arr[i+1]) st.pop();
            }
        }
        int[] ans = new int[st.size()];
        for(int i = 0; i < ans.length; i++){
            ans[ans.length - i-1] = st.pop();
        }
        System.out.println();
        return ans;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        print(arr);
        arr = remove2(arr);
        print(arr);
    }
}
