
public class stringTraversal {
    public static void printString(String str, int i) {
        if (str.length() <= i)
            return;

        System.out.print(str.charAt(i));
        printString(str, i + 1);
    }

    public static void main(String[] args) {
        String str = "Gitesh Mali";
        printString(str, 0);
    }
}
