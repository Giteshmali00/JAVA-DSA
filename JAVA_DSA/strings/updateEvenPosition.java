package JAVA_DSA.strings;

public class updateEvenPosition {
    public static void main(String[] args) {
        String s = "Physics Wallah Skills";
        int n = s.length();
        String str = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                str += 'a';
            } else {
                str = str + s.charAt(i);
            }
        }
        s = str;
        System.out.print(s);
    }
}
