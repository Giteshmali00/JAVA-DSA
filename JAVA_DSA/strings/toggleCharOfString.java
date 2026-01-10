
import java.util.Scanner;

public class toggleCharOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            int ascii = (int) c;
            if (ascii >= 65 && ascii <= 90) {
                ascii += 32;
            } else if (ascii >= 97 && ascii <= 122) {
                ascii -= 32;
            }
            c = (char) ascii;
            sb.setCharAt(i, c);
        }
        System.out.println(sb);
    }
}
