// package daily_challenges;

public class wavinessOfNumbers3751 {
    public static int totalWaviness(int num1, int num2) {
        int ans = 0;
        if(num2 <= 100) return 0;
        if(num1 <= 100) num1 = 101;
        for(int i = num1; i <= num2; i++){
            int rem = i;
            int digits = i;
            while(rem != 0){
                int d1 = rem % 10;
                rem = rem / 10;
                int d2 = rem % 10;
                rem = rem / 10;
                int d3 = rem % 10;
                if((d2 > d1 && d2 > d3) || (d2 < d1 && d2 < d3)){
                    ans++;
                }
                if(rem >= 10) {
                    rem = digits = digits / 10;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Total Waviness of numbers is : "+totalWaviness(123, 150));
    }
}
