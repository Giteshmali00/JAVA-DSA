package conditionals;

import java.util.Scanner;

public class profitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price : ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling Price : ");
        int sp = sc.nextInt();

        if (cp > sp)
            System.out.print("Total Loss : " + (cp - sp));
        else if (cp < sp)
            System.out.print("Total Profit : " + (sp - cp));
        else
            System.out.print("No Profit no Loss");
    }
}
