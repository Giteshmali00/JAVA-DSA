package JAVA_DSA.recursion.PracticeQs;

import java.util.Scanner;

public class countAndSay {
    public static String say(int n) {
        if (n == 1)
            return "1";
        String s = say(n - 1);
        StringBuilder ans = new StringBuilder("");
        int i = 0, j = 0;
        while (j < s.length()) {
            if (s.charAt(i) == s.charAt(j))
                j++;
            else {
                ans.append(j - i);
                ans.append(s.charAt(i));
                i = j;
            }
        }
        ans.append(j - i);
        ans.append(s.charAt(i));
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.println(say(n));
    }
}
