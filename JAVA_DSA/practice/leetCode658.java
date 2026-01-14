import java.util.*;

public class leetCode658 {
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> ans = new ArrayList<>(k);
        int n = arr.length;
        if(x <= arr[0]){
            for(int i = 0; i < k; i++){
                ans.add(arr[i]);
            }
            return ans;
        }
        if(x >= arr[n-1]){
            for(int i = n-k; i < n; i++){
                ans.add(arr[i]);
            }
            return ans;
        }
        
        int lb = n;
        int lo = 0;
        int hi = n-1;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid] == x){
                lb = mid;
                break;
            }
            if(arr[mid] > x){
                lb = Math.min(mid, lb);
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        
        int i = lb - 1;
        int j = lb;

        while(i >= 0 && j <= n-1 && k > 0){
            if(x - arr[i] <= arr[j] - x){
                ans.add(arr[i--]);
            }else{
                ans.add(arr[j++]);
            }
            k--;
        }

        while(i >= 0 && k > 0){
            ans.add(arr[i--]);
            k--;
        }
        while(j <= n - 1 && k > 0){
            ans.add(arr[j++]);
            k--;
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,8,10};
        print(arr);
        
        System.out.println(findClosestElements(arr, 2, 15));

    }
}
