package JAVA_DSA.strings;

import java.util.Scanner;

public class reverseIndividualWords {
    public static void reverseString(StringBuilder sb, int i, int j) {
        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i++, sb.charAt(j));
            sb.setCharAt(j--, temp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int i = 0, j = 0;
        while (j < sb.length()) {
            if (sb.charAt(j) == ' ' || j == sb.length()) {
                reverseString(sb, i, j - 1);
                i = j + 1;
                j = i;
            } else {
                j++;
            }
        }
        System.out.println(sb);
    }
}
