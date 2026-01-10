
import java.util.*;

public class copyOfArray {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int len = arr.length;

		System.out.print("Original Array : ");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();

		// Method 1.Shallow Copy
		int[] brr = arr; // This is Called as Shallow Copy. Means If You Make Any Changes in brr Then the
							// Changes Also be affect in arr.
		brr[0] = 15;
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();
		for (int ele : brr) {
			System.out.print(ele + " ");
		}
		System.out.println();

		// Method 2.Deep Copy
		int[] crr = Arrays.copyOf(arr, arr.length);
		crr[0] = 25;
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		System.out.println();

		// Method 3.Deep Copy
		int[] drr = new int[arr.length];
		for (int i = 0; i < len; i++) {
			drr[i] = arr[i];
		}
		for (int ele : drr) {
			System.out.print(ele + " ");
		}

	}
}