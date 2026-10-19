public class rightmostSetBit {
    public static int method1(int num){
        return num & (num-1);
    }
    public static int method2(int num){
        int ans = num;
        for(int i = 0; i <= 32; i++){
            int mask = ~(1<<i);
            ans = num & mask;
            if(ans != num) break;
        }
        return ans;
    }
    static void main(String[] args) {
        int num = 1480;
        System.out.println(num);
        System.out.println(method1(num));
        System.out.println(method2(num));
    }
}
