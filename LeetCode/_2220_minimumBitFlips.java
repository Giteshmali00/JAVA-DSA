import java.util.Scanner;

public class _2220_minimumBitFlips {
    public static int minBitFlips(int start, int goal) {
        int flips = 0;
        int mask = start^goal;
        while(mask!=0){
            mask &= (mask-1);
            flips++;
        }
        return flips;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter goal: ");
        int goal = sc.nextInt();
        System.out.println(minBitFlips(start,goal));
    }
}
