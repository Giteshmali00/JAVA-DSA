
import java.util.Scanner;

public class binarySearch704 {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int lo = 0;
        int hi = n - 1;

        while (hi >= lo) {
            int mid = (hi + lo) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter Array elements : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter Target element : ");
        int target = sc.nextInt();
        int forn = search(nums, target);
        if (forn == -1) {
            System.out.print("Target not found!!");
        } else
            System.out.print("Target found at index " + forn);
    }
}
