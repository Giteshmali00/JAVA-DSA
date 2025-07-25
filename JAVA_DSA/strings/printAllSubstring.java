package JAVA_DSA.strings;

public class printAllSubstring {
    public static void main(String[] args) {
        String str = "Gitesh";
        int n = str.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }
    }
}
