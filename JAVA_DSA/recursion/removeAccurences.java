
public class removeAccurences {
    public static void printString(String str, int i, String ans) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        if (str.charAt(i) != 'i')
            ans = ans + str.charAt(i);
        printString(str, i + 1, ans);
    }

    public static void main(String[] args) {
        String str = "Gitesh Mali";
        printString(str, 0, "");
    }
}
