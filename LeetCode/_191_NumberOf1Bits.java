import java.util.Scanner;

public class _191_NumberOf1Bits {
    //Method 2:
    public static int hammingWeight2(int n) {
        int count = 0;
        while(n!=0){
            n &= (n-1);
            count++;
        }
        return count;
    }
    //Method 1 :
    public static int hammingWeight(int n) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            int mask = (1<<i);
            if((mask&n)!=0) count++;
        }
        return count;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(hammingWeight2(n));
    }
}
