package JAVA_DSA.recursion;

public class permutation {
    public static void permu(String str, String store) {
        if (str.length() == 0) {
            System.out.print(store + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            permu(left + right, store + ch);
        }
    }

    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuwxyz";
        permu(str, "");
    }
}
