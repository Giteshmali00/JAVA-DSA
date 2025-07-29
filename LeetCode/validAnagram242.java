package LeetCode;

import java.util.Arrays;

public class validAnagram242 {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] ch = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ch2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "gitesh";
        String str2 = "tigesh";

        System.out.print(isAnagram(str1, str2));
    }
}