import java.util.Scanner;

public class setKthBit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the bit to on: ");
        int k = sc.nextInt();
        int ans = num | (1<<k);
        System.out.println("ans: "+ans);
    }
}
