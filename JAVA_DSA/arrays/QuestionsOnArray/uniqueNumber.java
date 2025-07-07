package JAVA_DSA.arrays.QuestionsOnArray;

public class uniqueNumber {
    public static void main(String[] args) {
        int[] arr = { 11, 20, 40, 20, 10, 40, 10 };
        int n = arr.length;

        int un = 0;
        for (int i = 0; i < n; i++) {
            un ^= arr[i];
        }
        System.out.println("Unique Number is " + un);

    }
}
