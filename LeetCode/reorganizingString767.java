import java.util.PriorityQueue;

public class reorganizingString767 {
    static class Pair {
        char ch;
        int freq;

        Pair(char ch, int freq) {
            this.ch = ch;
            this.freq = freq;
        }
    }

    public static String reorganizeString(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Integer.compare(b.freq, a.freq));
        int[] farr = new int[26];
        int maxFreq = 0;
        for (int i = 0; i < s.length(); i++) {
            int idx = s.charAt(i) - 'a';
            farr[idx]++;
            maxFreq = Math.max(maxFreq, farr[idx]);
        }
        if (maxFreq > (s.length() + 1) / 2)
            return "";
        for (int i = 0; i < farr.length; i++) {
            if (farr[i] != 0) {
                char ch = (char) ('a' + i);
                pq.add(new Pair(ch, farr[i]));
            }
        }

        while (!pq.isEmpty()) {
            Pair first = pq.poll();
            first.freq--;
            if (pq.isEmpty()) {
                if (first.freq == 0)
                    sb.append(first.ch);
                else
                    return "";

                break;
            }
            Pair second = pq.poll();
            second.freq--;
            sb.append(first.ch);
            sb.append(second.ch);
            if (first.freq > 0)
                pq.add(first);
            if (second.freq > 0)
                pq.add(second);
        }

        return sb.toString();
    }

    static void main(String[] args) {
        String str = "aabcdaajdbbb";
        System.out.println(str);
        System.out.println(reorganizeString(str));
    }
}
