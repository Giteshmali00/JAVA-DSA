public class turnOffKthBit {
    static void main(String[] args) {
        int num = 35;
        int k = 5;

        int mask = ~(1<<k);
        int ans = num & mask;
        System.out.println(ans);
    }
}
