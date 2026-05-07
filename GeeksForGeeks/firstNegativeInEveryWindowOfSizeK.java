import java.util.*;

public class firstNegativeInEveryWindowOfSizeK {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int n = arr.length;
        
        for(int i = 0; i < n; i++){// Adding -ve value indices
            if(arr[i] < 0) q.add(i);
        }
        
        for(int i = 0; i < n - k + 1; i++){
            if(!q.isEmpty() && q.peek() < i) q.poll();
            
            if(!q.isEmpty() && q.peek() <= i + k - 1) ans.add(arr[q.peek()]);
            else if(!q.isEmpty() && q.peek() > i + k -1) ans.add(0);
            else ans.add(0);
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        print(arr);
        List<Integer> ans = firstNegInt(arr, k);
        System.out.println(ans);
    }
}
