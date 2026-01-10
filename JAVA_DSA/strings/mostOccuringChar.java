
public class mostOccuringChar {
    public static void main(String[] args) {
        String str = "aaagitesssshhhhmali";
        int[] crr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int ch = (int) str.charAt(i);
            crr[ch - 97]++;
        }
        int max = crr[0];
        for (int i = 0; i < crr.length; i++) {
            if (max < crr[i]) {
                max = crr[i];
            }
        }
        for (int i = 0; i < crr.length; i++) {
            if (max == crr[i]) {
                char ans = (char) (97 + i);
                System.out.print(ans + " ");
            }
        }
        // char ans = (char) (97 + midx);
        // System.out.println(ans);
    }
}
