import java.util.HashMap;
import java.util.HashSet;

public class uniqueNumOfOccurrences1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int val : map.values()){
            set.add(val);
        }

        return set.size() == map.size();
    }

    static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println("is this Unique number of occurrences in the array? : "+uniqueOccurrences(arr));
    }
}
