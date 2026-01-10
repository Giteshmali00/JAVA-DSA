
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        List<List<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    l.add(1);
                else
                    l.add(lists.get(i - 1).get(j) + lists.get(i - 1).get(j - 1));
            }
            lists.add(l);
            System.out.println(l);
        }

    }
}
