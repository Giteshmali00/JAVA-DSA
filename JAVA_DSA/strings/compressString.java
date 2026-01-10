
public class compressString {
    public static void main(String[] args) {
        char[] ah = { 'g', 'g', 'i', 'i', 'i', 't', 'e', 'e', 's', 'h', 'h' };

        int i = 0;
        int j = 1;

        StringBuilder str = new StringBuilder("");
        while (j < ah.length) {
            if (ah[i] != ah[j]) {
                str.append(ah[i]);
                if (j - i > 1)
                    str.append(j - i);
                i = j;
            }
            j++;
        }
        str.append(ah[i]);
        if (j - i > 1)
            str.append(j - i);
        System.out.println(str);
    }
}
