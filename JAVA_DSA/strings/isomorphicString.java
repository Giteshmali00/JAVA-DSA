package JAVA_DSA.strings;

import java.util.Scanner;

public class isomorphicString {
    public static boolean isIsomorphic(String s1, String s2) {
        char[] crr = new char[128];
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            char dh = s2.charAt(i);
            int idx = (int) ch;
            if (crr[idx] == '\0') {
                crr[idx] = dh;
            } else {
                if (crr[idx] != dh)
                    return false;
            }
        }
        for (int i = 0; i < 128; i++) {
            crr[i] = '\0';
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            char dh = s1.charAt(i);
            int idx = (int) ch;
            if (crr[idx] == '\0') {
                crr[idx] = dh;
            } else {
                if (crr[idx] != dh)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String : ");
        String s1 = sc.nextLine();
        System.out.print("Enter First String : ");
        String s2 = sc.nextLine();

        System.out.println(isIsomorphic(s1, s2));
        ;

    }
}
