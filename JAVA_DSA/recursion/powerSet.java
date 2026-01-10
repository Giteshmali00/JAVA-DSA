
import java.util.ArrayList;

public class powerSet {
    static ArrayList<String> power = new ArrayList<>();

    public static void setOfSubsets(String str, String ans, int i) {
        if (str.length() == i) {
            power.add(ans);
            return;
        }
        setOfSubsets(str, ans, i + 1);
        setOfSubsets(str, ans + str.charAt(i), i + 1);
    }

    public static void main(String[] args) {
        String str = "Gitesh";
        power = new ArrayList<>();
        setOfSubsets(str, "", 0);
        System.out.println(power);
    }
}
