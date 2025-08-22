package JAVA_DSA.strings;

public class maxValInString {
    public static void main(String[] args) {
        String[] str = { "1234", "0000087911", "000087911", "0002231", "9922", "0034" };

        String maxS = str[0];
        for (int i = 1; i < str.length; i++) {
            maxS = max(maxS, str[i]);
        }
        System.out.println(maxS);
    }

    public static String max(String maxS, String s) {
        String a = purify(maxS);
        String b = purify(s);
        if (a.length() > b.length())
            return maxS;
        if (a.length() < b.length())
            return s;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) > b.charAt(i))
                return maxS;
            else
                return s;
        }
        if (maxS.length() >= s.length())
            return maxS;
        else
            return s;
    }

    public static String purify(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0')
                return s.substring(i);
        }

        return s;
    }
}
