
import java.util.Scanner;

public class oddPositionOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String : ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        int n = str.length();
        System.out.println(str);

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                str.setCharAt(i, '#');
        }
        System.out.println(str);
    }
}
