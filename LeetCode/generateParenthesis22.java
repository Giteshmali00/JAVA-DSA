package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class generateParenthesis22 {
    static List<String> ans;

    public static void parenthesis(int op, int cp, int n, String str) {
        if (str.length() == n * 2) {
            ans.add(str);
            return;
        }
        if (op < n)
            parenthesis(op + 1, cp, n, str + '(');
        if (cp < op)
            parenthesis(op, cp + 1, n, str + ')');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        ans = new ArrayList<>();
        parenthesis(0, 0, n, "");
        System.out.println(ans);
    }
}
