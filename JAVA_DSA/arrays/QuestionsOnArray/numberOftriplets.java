
public class numberOftriplets {
    public static void main(String[] args) {
        int[] arr = { 70, 8, 9, 10, 20, 30, 81, 3, 79, 80 };
        int n = arr.length;
        int x = 60;

        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = " + x);
                        found = true;
                    }
                }
            }
        }
        if (!found)
            System.out.print("No triplet found with sum = " + x);

    }
}
