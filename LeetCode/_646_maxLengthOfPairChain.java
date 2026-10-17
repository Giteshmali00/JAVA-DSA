import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _646_maxLengthOfPairChain {
    public static int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b)->Integer.compare(a[1],b[1]));
        int chain = 0, prevEnd = Integer.MIN_VALUE;
        for(int[] pair : pairs){
            if(prevEnd<pair[0]) {
                chain++;
                prevEnd = pair[1];
            }
        }
        return chain;
    }

    static void main(String[] args) {
        int[][] pairs = {{1,2},{7,8},{4,5},{5,9}};
        print(pairs);
        System.out.println("Longest chain to be found : "+findLongestChain(pairs));
    }
    private static void print(int[][] arr) {
        for(int[] a : arr){
            System.out.print("{"+a[0]+", "+a[1]+"} ");
        }
        System.out.println();
        Set<Integer> set = new HashSet<>();
        set.add(0);
        for(int ele : set){
            System.out.println(ele);
        }
    }
}
