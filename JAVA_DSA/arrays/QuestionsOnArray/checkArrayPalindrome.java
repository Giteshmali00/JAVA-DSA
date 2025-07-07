package JAVA_DSA.arrays.QuestionsOnArray;

public class checkArrayPalindrome {
    public static void main(String[] args) {
        int[] arr = { 7, 3, 9, 10, 30, 10, 9, 3, 7 };
        int n = arr.length;

        int i = 0, j = n - 1;

        boolean flag = true;
        while (i < j) {
            if (arr[i++] != arr[j--]) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.print("Given Array is Palindrome.");
        else
            System.out.print("Given Array isn't Palindrome.");
    }
}
