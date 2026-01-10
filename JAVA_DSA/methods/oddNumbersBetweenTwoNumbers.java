
import java.util.Scanner;

public class oddNumbersBetweenTwoNumbers {
    static void oddNumbers(int s, int e) {
        System.out.println("Odd Numbers Between " + s + " and " + e + " is : ");
        for (int i = s + 1; i <= e - 1; i++) {
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting Number : ");
        int s = sc.nextInt();
        System.out.print("Enter Ending Number : ");
        int e = sc.nextInt();

        oddNumbers(s, e);
    }
}
