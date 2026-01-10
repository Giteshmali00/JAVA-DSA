
import java.util.ArrayList;
import java.util.List;

public class printing {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40);
        b.add(50);
        List<Integer> c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60);
        d.add(70);
        d.add(80);
        d.add(90);
        d.add(100);

        List<List<Integer>> lists = new ArrayList<>();

        lists.add(a);
        lists.add(b);
        lists.add(c);
        lists.add(d);

        for (int i = 0; i < lists.size(); i++) {
            for (int j = 0; j < lists.get(i).size(); j++) {
                System.out.print(lists.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
