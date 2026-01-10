
public class missingNumUsingCycleSort268 {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method 1 :-
    public static int miseleMethod1(int[] nums) {
        int n = nums.length;
        boolean[] arr = new boolean[n + 1];
        int j = 0;
        while (j < n) {
            arr[nums[j++]] = true;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i]) {
                return i;
            }
        }
        return -1;
    }

    // Method 2 :-
    public static int miseleMethod2(int[] arr) {
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] != i && arr[i] != n) {
                swap(arr, i, arr[i]);
            } else
                i++;
        }
        for (int j = 0; j < n; j++) {
            if (arr[j] != j)
                return j;
        }
        return n;
    }

    // Method 3 :-
    public static int miseleMethod3(int[] arr) {
        int n = arr.length;
        int i = 0;
        int ans = n;
        while (i < n) {
            if (arr[i] == i)
                i++;
            else if (arr[i] == n) {
                ans = i++;
            } else
                swap(arr, i, arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        // int missele = miseleMethod1(arr);
        // int missele = miseleMethod2(arr);
        int missele = miseleMethod3(arr);

        System.out.println(missele);
    }
}
