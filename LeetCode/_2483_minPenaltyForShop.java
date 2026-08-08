public class _2483_minPenaltyForShop {
    public static int bestClosingTime(String c) {
        int n = c.length();
        int pen = 0;
        for (int i = 0; i < n; i++) {
            if (c.charAt(i) == 'Y')
                pen++;
        }
        if (pen == n)
            return n;
        if (Math.abs(n - pen) == n)
            return 0;
        int minpen = pen, ans = 0;
        for (int i = 0; i < n; i++) {
            if (c.charAt(i) == 'Y')
                pen--;
            else
                pen++;
            if (pen < minpen) {
                minpen = pen;
                ans = i + 1;
            }
        }
        return ans;
    }

    static void main(String[] args) {
        String customers = "YYNY";
        System.out.println(customers);
        System.out.println("best Closing Time : "+bestClosingTime(customers)+"th hour");
    }
}
