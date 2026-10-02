import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _77_combinations {
    public static void backtrack(List<List<Integer>> ans, List<Integer> comb, int start, int n, int k){
        if(comb.size()==k) {
            ans.add(new ArrayList<>(comb));
            return;
        }
        for(int i = start; i <= n; i++){
            comb.add(i);
            backtrack(ans,comb,i+1,n,k);
            comb.remove(comb.size()-1);
        }
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans,new ArrayList<>(),1,n,k);
        return ans;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        System.out.print("Enter K : ");
        int k = sc.nextInt();
        System.out.println("Total Combinations : "+combine(n,k));
    }
}
