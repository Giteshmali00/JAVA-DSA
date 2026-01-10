
import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Year : ");
        int n = sc.nextInt();

        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            System.out.print("Leap Year.");
        } else
            System.out.print("Not a Leap Year.");
    }
}
