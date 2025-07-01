package arrays.QuestionsOnArray;

public class productOfAllEleInArr {
    public static void main(String[] args) {
        int[] arr = { 23, 33, 89, 44, 23, 44 };
        int n = arr.length;
        long product = arr[0];

        for (int i = 1; i < n; i++) {
            product = product * arr[i];
        }
        System.out.print("Product = " + product);
    }

}
